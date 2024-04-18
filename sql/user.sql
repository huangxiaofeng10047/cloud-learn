-- `user`.t_user definition

CREATE TABLE `t_user` (
                          `id` bigint NOT NULL AUTO_INCREMENT,
                          `username` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
                          `password` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
                          `email` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
                          `phone` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
                          `create_time` date DEFAULT NULL,
                          `update_time` date DEFAULT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;