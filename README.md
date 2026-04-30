# 苍穹外卖 - Sky Take-Out

外卖点餐系统全栈项目，包含管理后台、用户端 H5、微信小程序。

## 技术栈

| 层次 | 技术 |
|------|------|
| 后端 | Spring Boot 2.7.3 + MyBatis + MySQL + Redis |
| 管理端前端 | Vue 3 + TypeScript + Element Plus |
| 用户端前端 | HTML/CSS/JS（H5） |
| 微信小程序 | uni-app |
| 网关 | Nginx 反向代理 + 静态资源 |
| 文档 | Knife4j (Swagger) |
| 其他 | JWT 认证、WebSocket 推送、阿里云 OSS、微信支付、Apache POI |

## 项目结构

```
sky-take-out/
├── backend/                     # 后端 Spring Boot 多模块 Maven 项目
│   ├── sky-common/              # 公共模块：常量、枚举、异常、工具类（JWT、AliOss 等）
│   ├── sky-pojo/                # 数据模型：数据库实体（Entity）、传输对象（DTO）、视图对象（VO）
│   └── sky-server/              # 主服务：业务接口（Controller）、业务逻辑（Service）、数据访问（Mapper）
├── frontend-admin/              # 管理端：Vue 3 + TypeScript + Element Plus 源码
├── frontend-user/               # 用户端：H5 移动端（HTML/CSS/JS，编译后可直接部署）
├── mp-weixin/                   # 微信小程序：uni-app 源码，HBuilderX 打开即可编译
├── sql/                         # 数据库：建表 + 初始数据 SQL 脚本 + 表结构设计文档
├── docs/                        # 文档：Swagger API 接口 JSON + 产品原型设计稿
├── nginx/                       # 部署：Nginx 反向代理配置（前端 → 后端 + 静态资源托管）
└── README.md                    # 项目说明（本文件）
```

## 快速开始

### 环境要求

- JDK 8+ → [Adoptium 下载](https://adoptium.net/download/)
- MySQL 5.7+ → [MySQL Community 下载](https://dev.mysql.com/downloads/mysql/)
- Redis（Windows 推荐 [Memurai](https://www.memurai.com/)，或 WSL 安装）
- Maven 3.6+ → [Maven 下载](https://maven.apache.org/download.cgi)
- Node.js 12+（前端）→ [Node.js 下载](https://nodejs.org/)
- Nginx 1.20+ → [Nginx 下载](https://nginx.org/en/download.html)

> Redis 可视化工具推荐：[Another Redis Desktop Manager](https://github.com/qishibo/AnotherRedisDesktopManager/releases)（免费开源）
> 微信支付回调调试推荐：[cpolar](https://www.cpolar.com/)（内网穿透，免费版即可）

### 1. 初始化数据库

```bash
mysql -u root -p < sql/sky.sql
```

修改 `backend/sky-server/src/main/resources/application-dev.yml` 中的数据库和 Redis 连接信息。

### 2. 启动后端

```bash
cd backend
mvn clean compile
# 启动 sky-server 模块的 SkyApplication.java
```

后端默认端口：`8080`

### 3. 配置 Nginx

将 `nginx/nginx.conf` 复制到 Nginx 安装目录的 `conf/` 下，或将 `frontend-user/` 目录内容放到 Nginx 的 `html/sky/` 下。

### 4. 启动前端

**管理端：**
```bash
cd frontend-admin
npm install
npm run serve
```

**用户端：** 由 Nginx 直接托管静态文件，访问 `http://localhost/`

**微信小程序：** 用 HBuilderX 打开 `mp-weixin/` 目录，编译到微信开发者工具。

### 5. 访问

| 端 | 地址 |
|----|------|
| 管理端 | `http://localhost/` |
| 管理端 API 文档 | `http://localhost:8080/doc.html` |
| 用户端 | `http://localhost/user/` |

## 功能模块

- 员工管理（登录/退出/CRUD）
- 分类管理（菜品分类/套餐分类）
- 菜品管理（CRUD/起售停售/口味管理）
- 套餐管理（CRUD/起售停售）
- 订单管理（下单/支付/接单/拒单/派送/完成/取消/催单）
- 购物车
- 地址簿
- 数据统计（营业额/用户/订单/销量Top10/Excel导出）
- 店铺营业状态设置
- WebSocket 实时推送（来单提醒/催单）

## 接口文档

启动后端后访问 `http://localhost:8080/doc.html` 查看 Knife4j 接口文档。
管理端接口分组：`管理端接口`，用户端接口分组：`用户端接口`。

---

---

由 [@yee211](https://github.com/yee211) 与 [Claude Code](https://claude.ai/code) 共同搭建
