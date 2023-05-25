package com.teamcreator.creator.Controllers;

import com.teamcreator.creator.Modelo.User;
import com.teamcreator.creator.Services.UserService;

import net.coobird.thumbnailator.Thumbnails;

import org.owasp.html.PolicyFactory;
import org.owasp.html.Sanitizers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.imageio.ImageIO;

//Estas clases son parte del sistema de archivos de la NIO.2 (New I/O 2) de Java, que es una actualización importante que permite un acceso más sofisticado y versátil a los sistemas de archivos. Proporciona una gran cantidad de funcionalidad para operaciones de sistemas de archivos, como copiar, mover, gestionar y manipular archivos y directorios.
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;

@Controller //se utiliza para construir aplicaciones web y devuelve vistas.
//@RestController // es una versión especializada de @Controller que se utiliza para construir servicios RESTful y devuelve directamente objetos JSON. incompatible con @Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


// Instancia a Sanitizador de HTML import org.owasp.html.PolicyFactory; import org.owasp.html.Sanitizers;
    private static final PolicyFactory POLICY_FACTORY = Sanitizers.FORMATTING.and(Sanitizers.LINKS);

//metodo dar formato fechas para Modal
    public String formatLocalDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        return dateTime.format(formatter);
    }

// Crear un nuevo user (POST)
@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
public ResponseEntity<User> createUser(@ModelAttribute User user, BindingResult bindingResult, @RequestParam("userPhoto") MultipartFile userPhoto) {
    if (bindingResult.hasErrors()) {
        // handle errors here, for example return an error response
    }

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String encodedPassword = passwordEncoder.encode(user.getUserPassword());
    user.setUserPassword(encodedPassword);
    
    LocalDateTime currentDateTime = LocalDateTime.now();
    user.setUserDateConsent(currentDateTime);
    user.setUserCreatedAt(currentDateTime);

    // Sanitize input fields
    user.setUserName(POLICY_FACTORY.sanitize(user.getUserName()));
    user.setUserSurname(POLICY_FACTORY.sanitize(user.getUserSurname()));
    user.setUserDni(POLICY_FACTORY.sanitize(user.getUserDni()));
    user.setEmailUser(user.getEmailUser());
    user.setUserAddress(POLICY_FACTORY.sanitize(user.getUserAddress()));
    user.setUserCity(POLICY_FACTORY.sanitize(user.getUserCity()));
    user.setUserCountry(POLICY_FACTORY.sanitize(user.getUserCountry()));
    user.setUserGender(POLICY_FACTORY.sanitize(user.getUserGender()));
    
// Verificamos si se ha subido una foto
if (!userPhoto.isEmpty()) {
    try {
        // Obtenemos el nombre del archivo original
        String originalFilename = userPhoto.getOriginalFilename();
        String extension = "";

        // Verificamos que el nombre original no sea nulo y tenga una extensión
        if (originalFilename != null && originalFilename.lastIndexOf(".") > 0) {
            extension = originalFilename.substring(originalFilename.lastIndexOf("."));
        }

        // Generamos un nombre de archivo único y le añadimos la extensión original
        String uniqueFilename = UUID.randomUUID().toString() + extension;

        // Construimos la ruta completa donde se guardará la foto
        Path rootPath = Paths.get("src/main/resources/static/images/users").resolve(uniqueFilename).toAbsolutePath();

        // Creamos las carpetas necesarias si no existen
        Files.createDirectories(rootPath.getParent());

        // Verificamos si el tamaño del archivo supera el límite de 200 KB
        if (userPhoto.getSize() > 200 * 1024) { // 200 KB
            // Cargamos la imagen original
            BufferedImage originalImage = ImageIO.read(userPhoto.getInputStream());

            // Reducimos el tamaño de la imagen
            BufferedImage resizedImage = Thumbnails.of(originalImage)
                .size(800, 800) // Estos valores se pueden ajustar según nuestras necesidades
                .outputQuality(0.75) // Este valor se puede ajustar según nuestras necesidades
                .asBufferedImage();

            // Guardamos la imagen reducida
            File outputFile = new File(rootPath.toUri());
            ImageIO.write(resizedImage, extension.substring(1), outputFile);
        } else {
            // Si el tamaño de la imagen es aceptable, la guardamos sin modificarla
            Files.copy(userPhoto.getInputStream(), rootPath, StandardCopyOption.REPLACE_EXISTING);
        }

        // Guardamos la ubicación de la foto en el usuario
        user.setUserPhoto(uniqueFilename);

    } catch (Exception e) {
        // Si algo va mal, lanzamos una excepción
        throw new RuntimeException("No se pudo guardar el archivo. Error: " + e.getMessage());
    }
}

    User newUser = userService.save(user);

    return new ResponseEntity<>(newUser, HttpStatus.CREATED);
}


// Actualizar un user existente (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable UUID id, @RequestBody User user) {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String encodedPassword = passwordEncoder.encode(user.getUserPassword());
    user.setUserPassword(encodedPassword);

   // Sanitize input fields
   user.setUserName(POLICY_FACTORY.sanitize(user.getUserName()));
   user.setUserSurname(POLICY_FACTORY.sanitize(user.getUserSurname()));
   user.setUserDni(POLICY_FACTORY.sanitize(user.getUserDni()));
   user.setEmailUser(user.getEmailUser());
   user.setUserAddress(POLICY_FACTORY.sanitize(user.getUserAddress()));
   user.setUserCity(POLICY_FACTORY.sanitize(user.getUserCity()));
   user.setUserCountry(POLICY_FACTORY.sanitize(user.getUserCountry()));
   user.setUserGender(POLICY_FACTORY.sanitize(user.getUserGender()));
    
    User updatedUser = userService.update(id, user);
    return new ResponseEntity<>(updatedUser, HttpStatus.OK);
}

// Obtener todos los Usuarios (GET)
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

// Obtener un user por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable UUID id) {
        User user = userService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

//Obtener user para editar en html
    @GetMapping("/detalle/{id}")
    public String verUserDetalle(@PathVariable UUID id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        model.addAttribute("userDateConsentFormatted", formatLocalDateTime(user.getUserDateConsent()));
        model.addAttribute("userCreatedAtFormatted", formatLocalDateTime(user.getUserCreatedAt()));
        return "/views/Users/user-detail";
    }

// Eliminar un User por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

// Creando la interfaz web
    public UserController(UserService userService) {
        this.userService = userService;
    }

//obtener listado de usuarios
    @GetMapping("/listado-users")
    public String listarUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        model.addAttribute("user", new User()); // Añade esta línea
        return "/views/Users/listado-users";
    }
}