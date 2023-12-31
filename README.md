# guigu-ssyx-parent
## 简介
### 这是一个类美团优选的项目，通过SpringBoot进行开发，主要应用在各大高校中（也许）为同学们提供一站式的生鲜采购平台，方便给学校地区偏远、物资匮乏的学校提供商品采购方案。
## 业务
### =======
    从具体模式看，主要围绕平台、团长、用户三个角色展开：

1. 团长（如社区宝妈、便利店老板等）创建一个群，提前发布优惠商品的链接供用户购买，团长从中抽取佣金；

2. 用户提前一天下单；

3. 平台在收集好订单之后，调动供应链，从仓库发货到自提点（团长家或者便利店）；

4. 用户前往自提点提货

## 项目结构
  1. 后端管理系统
     - 后端管理系统负责登录地区管理、管理人员安排、商品分配以及活动安排。
  2. 用户界面
     - 用户界面采用微信小程序，用户可以使用小程序订购商品（后续计划推出iOS和Android的App）
## 技术栈
### 前端
    1. 管理界面（ssyx-admin）
       - 管理界面采用Vue开发，并且实现前后端分离
    2. 微信小程序（atguigu-tuan）
       - 基于Vue的Uni-App前端界面，不仅实现前后端分离，后续也可封装为App
       - 使用内网穿透功能实现在线访问。
### 后端
#### 后端采用SpringCloud技术开发，是一个分布式项目，每一个业务被分为一个模块，实现不同功能，此外使用Nacos实现服务发现、RabbitMQ实现消息队列，ElasticSearch + Kibana实现全文检索服务器 +可视化数据监控，GateWay网关实现分布式，Nginx实现负载均衡，RedisSession实现分布式锁。

## 环境配置
  - Java：JDK1.8.0
  - MySQL：8.0.33
  - Maven：3.8.1
  - NodeJS：16.14.0
  - Nacos：2.2.3
  - ElasticSearch + Kibana：7.8.0
  - Nginx：1.20.2

## 配置运行
### 后端
 1. 重要重要重要：在运行项目前请务必将service模块中各个子模块静态资源（resources）中的application.yml和application-dev.yml中各个组件的IP设置为与当前环境相符。
 2. 运行项目前需要先启动MySQL、Nacos、RabbitMQ、ElasticSearch、Kibana（请按顺序启动）
 3. 启动后端项目时需要启动service-gateway中的服务以及service中所有子模块
### 前端
 1. 前端启动时需要先配置好node
 2. 在ide的Terminal中输入npm install 进行组件安装
 3. 输入npm run dev启动前端界面
       
