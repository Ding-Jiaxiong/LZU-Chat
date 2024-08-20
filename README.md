### LZU-Chat 兰大人的聊天室



![Logo配色图](./assets/Logo配色图-1724053186948-2.png)



#### 1. 项目介绍



##### 1.1 项目的整体介绍



【LZU-Chat】 - 兰大人的聊天室，一个 IM 项目，通过 netty 实现和前端的 websocket 连接。内含微信扫描登录，成员列表，消息列表，消息互动，丰富的消息类型，还有很多实用的小轮子列如 aop 日志，分布式锁注解，频控注解，ip 解析归属地等。



##### 1.2 项目展示



###### 1.2.1 前端



###### 1.2.2 后端



###### 1.2.3 GitHub



##### 1.3 技术选型



###### 1.3.1 后端



| 技术                | 说明                                       | 官网                                                         |
| ------------------- | ------------------------------------------ | ------------------------------------------------------------ |
| SpringBoot          | web开发必备框架                            | https://spring.io/projects/spring-boot                       |
| MyBatis             | ORM框架                                    | http://www.mybatis.org/mybatis-3/zh/index.html               |
| MyBatisPlus         | 零sql，简化数据库操作，分页插件            | https://baomidou.com/                                        |
| Redis               | 缓存加速，多数据结构支持业务功能           | [https://redis.io](https://redis.io/)                        |
| Caffeine            | 本地缓存                                   | http://caffe.berkeleyvision.org/                             |
| Nginx               | 负载均衡，https配置，websocket升级，ip频控 | [https://nginx.org](https://nginx.org/)                      |
| Docker              | 应用容器引擎                               | [https://www.docker.com](https://www.docker.com/)            |
| Oss                 | 对象存储                                   | https://letsencrypt.org/                                     |
| Jwt                 | 用户登录，认证方案                         | [https://jwt.io](https://jwt.io/)                            |
| Lombok              | 简化代码                                   | [https://projectlombok.org](https://projectlombok.org/)      |
| Hutool              | Java工具类库                               | https://github.com/looly/hutool                              |
| Swagger-UI          | API文档生成工具                            | https://github.com/swagger-api/swagger-ui                    |
| Hibernate-validator | 接口校验框架                               | [hibernate.org/validator/](https://github.com/zongzibinbin/MallChat/blob/main/hibernate.org/validator) |
| minio               | 自建对象存储                               | https://github.com/minio/minio                               |



###### 1.3.2 前端



| 技术         | 说明                                      | 官网                                                         |
| ------------ | ----------------------------------------- | ------------------------------------------------------------ |
| Vue3         | 前端流行开发框架                          | [https://cn.vuejs.org](https://cn.vuejs.org/)                |
| Pinia        | vue3 官方推荐状态管理框架                 | [https://pinia.vuejs.org](https://pinia.vuejs.org/)          |
| vue-router   | Vue 的官方路由                            | [https://router.vuejs.org](https://router.vuejs.org/)        |
| TypeScript   | 让 JS 具备类型声明                        | https://www.typescriptlang.org/                              |
| Element Plus | 缓基于 vue3 的组件库                      | [https://element-plus.gitee.io](https://element-plus.gitee.io/) |
| Alova        | 轻量级的请求策略库，用起来负担比 axios 小 | https://alova.js.org/                                        |
| vite         | 极速的前端打包构建工具                    | [https://cn.vitejs.dev](https://cn.vitejs.dev/)              |
| pnpm         | 速度快、节省磁盘空间的软件包管理器        | [https://www.pnpm.cn](https://www.pnpm.cn/)                  |



##### 1.4 项目亮点



- ip归属地解析
- 消息标记 —— 装饰器模式
- url小卡片 —— 责任链模式
- **社群答疑**
- 用户信息懒加载相架
- 适配器模式
- 缓存框架多类型消息一策赂模式
- 分布式锁注解
- **真实面经解析**
- **本地消息表**
- 已读未读列表
- 频控注解
- 游标翻页工具类
- 敏感词功能与算法
- 推拉结合
- **IM顶层设计**

