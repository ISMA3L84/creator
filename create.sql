
    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);

    create table equipos (
       id integer not null auto_increment,
        fecha_fin_equipo date,
        fecha_inicio_equipo date,
        nombre_equipo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table pruebas (
       id integer not null auto_increment,
        advertencias varchar(255),
        descripcion_prueba varchar(255),
        duracion_estimada_aprox time,
        edad_minima_recomendada integer,
        equipamiento_especial_obligatorio varchar(255),
        nombre_prueba varchar(255),
        puntos integer,
        primary key (id)
    ) engine=InnoDB;

    create table resultados (
       id integer not null auto_increment,
        fecha date,
        posicion integer,
        puntos_conseguidos integer,
        id_equipo integer not null,
        id_pruebas integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        gender varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        user_photo varchar(255),
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    create table userspor_equipo (
       id bigint not null auto_increment,
        id_equipo integer not null,
        id_user BINARY(16) not null,
        primary key (id)
    ) engine=InnoDB;

    alter table resultados 
       add constraint FK6u6itxf9meg9iomj85gjtmx7n 
       foreign key (id_equipo) 
       references equipos (id);

    alter table resultados 
       add constraint FK65vqca365n7irv3ww8u814e24 
       foreign key (id_pruebas) 
       references pruebas (id);

    alter table userspor_equipo 
       add constraint FK3hd1ak6ja01gfm149kkymkvvd 
       foreign key (id_equipo) 
       references equipos (id);

    alter table userspor_equipo 
       add constraint FKjf2owlu0srfej0nuna912kctc 
       foreign key (id_user) 
       references users (id);
