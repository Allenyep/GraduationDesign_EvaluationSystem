/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/5/11 15:13:17                           */
/*==============================================================*/


drop table if exists abilitypoint;

drop table if exists course;

drop table if exists evaluationrecord;

drop table if exists historytestpaper;

drop table if exists knowledgepoint;

drop table if exists latestabilityscore;

drop table if exists major;

drop table if exists post;

drop table if exists postabilitypoint;

drop table if exists professionalabilitypointrequirements;

drop table if exists questionstyle;

drop table if exists questions;

drop table if exists questionspoint;

drop table if exists scoredetail;

drop table if exists student;

drop table if exists studentcourse;

drop table if exists studentpost;

drop table if exists teacher;

drop table if exists teachercourse;

drop table if exists features;

drop table if exists jsgnb;

drop table if exists majorb;

drop table if exists majorcourse;

drop table if exists role;

drop table if exists user;

drop table if exists userfeatures;

drop table if exists userrole;

/*==============================================================*/
/* Table: abilitypoint                                          */
/*==============================================================*/
create table abilitypoint
(
   id_ap                int not null,
   name_ap              varchar(50),
   aspect_ap            varchar(50),
   class_ap             varchar(50),
   primary key (id_ap)
);

/*==============================================================*/
/* Table: course                                                */
/*==============================================================*/
create table course
(
   id_c                 varchar(32) not null,
   name_c               varchar(50),
   leader_c             varchar(50),
   introduction_c       text,
   primary key (id_c)
);

/*==============================================================*/
/* Table: evaluationrecord                                      */
/*==============================================================*/
create table evaluationrecord
(
   id_t                 varchar(32) not null,
   id_s                 varchar(32) not null,
   id_er                varchar(32) not null,
   begin_er             varchar(20),
   end_er               varchar(20),
   consumption_er       varchar(10),
   primary key (id_t, id_s, id_er)
);

/*==============================================================*/
/* Table: historytestpaper                                      */
/*==============================================================*/
create table historytestpaper
(
   id_t                 varchar(32) not null,
   id_s                 varchar(32) not null,
   id_er                varchar(32) not null,
   id_q                 varchar(32) not null,
   answer_htp           text,
   score_htp            varchar(10),
   timeconsuming_htp    varchar(20),
   timeproportion_htp   varchar(10),
   primary key (id_t, id_s, id_er, id_q)
);

/*==============================================================*/
/* Table: knowledgepoint                                        */
/*==============================================================*/
create table knowledgepoint
(
   id_kp                int not null,
   id_ap                int,
   name_kp              varchar(50),
   proportion_kp        varchar(10),
   id_c                 varchar(32),
   note_kp              text,
   primary key (id_kp)
);

/*==============================================================*/
/* Table: latestabilityscore                                    */
/*==============================================================*/
create table latestabilityscore
(
   id_s                 varchar(32) not null,
   id_ap                int not null,
   score_las            varchar(10),
   proportion_las       varchar(10),
   time_las             varchar(20),
   primary key (id_s, id_ap)
);

/*==============================================================*/
/* Table: major                                                 */
/*==============================================================*/
create table major
(
   id_m                 varchar(32) not null,
   name_m               varchar(100),
   leader_m             varchar(50),
   id_fm                char(32),
   primary key (id_m)
);

/*==============================================================*/
/* Table: post                                                  */
/*==============================================================*/
create table post
(
   id_p                 int not null,
   name_p               varchar(50),
   primary key (id_p)
);

/*==============================================================*/
/* Table: postabilitypoint                                      */
/*==============================================================*/
create table postabilitypoint
(
   id_p                 int not null,
   id_ap                int not null,
   proportion_sap       varchar(10),
   primary key (id_p, id_ap)
);

/*==============================================================*/
/* Table: professionalabilitypointrequirements                  */
/*==============================================================*/
create table professionalabilitypointrequirements
(
   id_ap                int not null,
   id_mb                int not null,
   requiredlevel_papr   int,
   conversionratio_papr varchar(10),
   primary key (id_ap, id_mb)
);

/*==============================================================*/
/* Table: questionstyle                                         */
/*==============================================================*/
create table questionstyle
(
   style_q              varchar(32) not null,
   name_qs              varchar(50),
   primary key (style_q)
);

/*==============================================================*/
/* Table: questions                                             */
/*==============================================================*/
create table questions
(
   id_q                 varchar(32) not null,
   id_c                 varchar(32),
   que_style_q          varchar(32),
   datatime_q           varchar(20),
   context_q            text,
   score_q              varchar(10),
   time_q               varchar(10),
   answer_q             text,
   style_q              varchar(20),
   id_t                 varchar(32),
   automaticscoring_q   varchar(10),
   deleteornot_q        varchar(10),
   primary key (id_q)
);

/*==============================================================*/
/* Table: questionspoint                                        */
/*==============================================================*/
create table questionspoint
(
   id_q                 varchar(32) not null,
   id_kp                int not null,
   proportion_qp        varchar(10),
   primary key (id_q, id_kp)
);

/*==============================================================*/
/* Table: scoredetail                                           */
/*==============================================================*/
create table scoredetail
(
   id_t                 varchar(32) not null,
   id_s                 varchar(32) not null,
   id_er                varchar(32) not null,
   id_q                 varchar(32) not null,
   id_ap                int not null,
   score_sd             varchar(10),
   time_sd              varchar(20),
   primary key (id_t, id_s, id_er, id_q, id_ap)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   id_s                 varchar(32) not null,
   name_s               varchar(50),
   id_m                 varchar(32),
   date_s               varchar(50),
   primary key (id_s)
);

/*==============================================================*/
/* Table: studentcourse                                         */
/*==============================================================*/
create table studentcourse
(
   id_c                 varchar(32) not null,
   id_s                 varchar(32) not null,
   primary key (id_c, id_s)
);

/*==============================================================*/
/* Table: studentpost                                           */
/*==============================================================*/
create table studentpost
(
   id_s                 varchar(32) not null,
   id_p                 int not null,
   score_sp             varchar(10),
   time_sp              varchar(20),
   primary key (id_s, id_p)
);

/*==============================================================*/
/* Table: teacher                                               */
/*==============================================================*/
create table teacher
(
   id_t                 varchar(32) not null,
   name_t               varchar(50),
   id_m                 varchar(50),
   majorleader_t        varchar(50),
   courseleader_t       varchar(50),
   primary key (id_t)
);

/*==============================================================*/
/* Table: teachercourse                                         */
/*==============================================================*/
create table teachercourse
(
   id_c                 varchar(32) not null,
   id_t                 varchar(32) not null,
   primary key (id_c, id_t)
);

/*==============================================================*/
/* Table: features                                              */
/*==============================================================*/
create table features
(
   id_f                 int not null,
   name                 varchar(50),
   link                 varchar(300),
   list                 varchar(50),
   primary key (id_f)
);

/*==============================================================*/
/* Table: jsgnb                                                 */
/*==============================================================*/
create table jsgnb
(
   id_f                 int,
   id_r                 int
);

/*==============================================================*/
/* Table: majorb                                                */
/*==============================================================*/
create table majorb
(
   id_mb                int not null,
   name_mb              varchar(100),
   primary key (id_mb)
);

/*==============================================================*/
/* Table: majorcourse                                           */
/*==============================================================*/
create table majorcourse
(
   id_c                 varchar(32) not null,
   id_m                 varchar(32) not null,
   primary key (id_c, id_m)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id_r                 int not null,
   jsm                  varchar(50),
   primary key (id_r)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null,
   id_u                 varchar(32) not null,
   password             varchar(50),
   name                 varchar(50),
   sex                  varchar(5),
   primary key (id_u)
);

/*==============================================================*/
/* Table: userfeatures                                          */
/*==============================================================*/
create table userfeatures
(
   id_f                 int,
   id_u                 varchar(32)
);

/*==============================================================*/
/* Table: userrole                                              */
/*==============================================================*/
create table userrole
(
   id_u                 varchar(32),
   id_r                 int
);

alter table evaluationrecord add constraint fk_student_evaluation foreign key (id_s)
      references student (id_s) on delete restrict on update restrict;

alter table evaluationrecord add constraint "fk_teacher-evaluationrecord" foreign key (id_t)
      references teacher (id_t) on delete restrict on update restrict;

alter table historytestpaper add constraint fk_evaluationrecord_historytestpaper foreign key (id_t, id_s, id_er)
      references evaluationrecord (id_t, id_s, id_er) on delete restrict on update restrict;

alter table historytestpaper add constraint fk_questions_historytestpaper foreign key (id_q)
      references questions (id_q) on delete restrict on update restrict;

alter table knowledgepoint add constraint fk_abilitypoint_knowledgepoint foreign key (id_ap)
      references abilitypoint (id_ap) on delete restrict on update restrict;

alter table latestabilityscore add constraint fk_evaluation_latestabilityscore foreign key (id_s)
      references student (id_s) on delete restrict on update restrict;

alter table postabilitypoint add constraint fk_post_postabilitypoint foreign key (id_p)
      references post (id_p) on delete restrict on update restrict;

alter table professionalabilitypointrequirements add constraint "fk_ap-papr" foreign key (id_ap)
      references abilitypoint (id_ap) on delete restrict on update restrict;

alter table professionalabilitypointrequirements add constraint "fk_sm-papr" foreign key (id_mb)
      references majorb (id_mb) on delete restrict on update restrict;

alter table questions add constraint fk_relationship_26 foreign key (que_style_q)
      references questionstyle (style_q) on delete restrict on update restrict;

alter table questions add constraint fk_course_testpaper foreign key (id_c)
      references course (id_c) on delete restrict on update restrict;

alter table questionspoint add constraint fk_knowledgepoint_questionpoint foreign key (id_kp)
      references knowledgepoint (id_kp) on delete restrict on update restrict;

alter table questionspoint add constraint fk_question_questionpoint foreign key (id_q)
      references questions (id_q) on delete restrict on update restrict;

alter table scoredetail add constraint fk_historytestpaper_scoredetail foreign key (id_t, id_s, id_er, id_q)
      references historytestpaper (id_t, id_s, id_er, id_q) on delete restrict on update restrict;

alter table studentcourse add constraint fk_relationship_27 foreign key (id_s)
      references student (id_s) on delete restrict on update restrict;

alter table studentcourse add constraint fk_relationship_28 foreign key (id_c)
      references course (id_c) on delete restrict on update restrict;

alter table studentpost add constraint fk_post_studentpost foreign key (id_p)
      references post (id_p) on delete restrict on update restrict;

alter table studentpost add constraint fk_student_studentpost foreign key (id_s)
      references student (id_s) on delete restrict on update restrict;

alter table teachercourse add constraint fk_relationship_24 foreign key (id_t)
      references teacher (id_t) on delete restrict on update restrict;

alter table teachercourse add constraint fk_relationship_25 foreign key (id_c)
      references course (id_c) on delete restrict on update restrict;

alter table jsgnb add constraint fk_relationship_41 foreign key (id_f)
      references features (id_f) on delete restrict on update restrict;

alter table jsgnb add constraint fk_relationship_44 foreign key (id_r)
      references role (id_r) on delete restrict on update restrict;

alter table majorcourse add constraint fk_relationship_22 foreign key (id_m)
      references major (id_m) on delete restrict on update restrict;

alter table majorcourse add constraint fk_relationship_23 foreign key (id_c)
      references course (id_c) on delete restrict on update restrict;

alter table userfeatures add constraint fk_relationship_40 foreign key (id_f)
      references features (id_f) on delete restrict on update restrict;

alter table userfeatures add constraint fk_relationship_42 foreign key (id_u)
      references user (id_u) on delete restrict on update restrict;

alter table userrole add constraint fk_relationship_43 foreign key (id_u)
      references user (id_u) on delete restrict on update restrict;

alter table userrole add constraint fk_relationship_45 foreign key (id_r)
      references role (id_r) on delete restrict on update restrict;

