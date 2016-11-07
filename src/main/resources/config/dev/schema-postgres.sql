CREATE TABLE IF NOT EXISTS Evenement (
  id_evt SERIAL PRIMARY KEY,
  date_evt varchar(255),
  desc_evt varchar(255) default NULL,
  heure_evt varchar(10) default NULL,
  image_evt varchar(255) default NULL,
  lieu_evt varchar(255) default NULL,
  nb_insc_evt integer NULL,
  nb_places_evt integer NULL,
  nom_evt varchar(255) default NULL,
  orga_evt varchar(255) default NULL
);
