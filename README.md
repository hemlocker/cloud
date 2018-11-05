## Spring Cloud 2.0+ #
#### 基于Spring Boot 2.0+ ####
### 简介 ####
用户浏览器请求，经过浏览器，请求达到Nginx，打开前台界面，由前台发起请求后台数据，当请求达到Nginx后，Nginx对网关层进行负载，因为网关也需要做HA，此时网关接收到请求后会根据请求路径进行动态路由，根据服务名发现是UserService中的服务，则从Ribbon中选择一台UserService的实例进行调用，由UserService返回数据，如果此时UserService需要使用第三方DataService的数据，则跟Zuul一样，选择一台DataService的实例进行调用，返回数据到前台即可渲染页面，流程结束<br/>
### 工程介绍 ###
工程|端口|描述
---|:--:|---:
cloud|N/A|父节点
cloud-client|9091|用户服务
cloud-common|N/A|公共组件
cloud-config-server|9090|配置中心
cloud-data|8099|数据服务，提供基础的数据
cloud-eureka-server|8761|注册中心
cloud-hystrix|9099|hystrix dashboard& Turbine
cloud-zuul|7777|API GateWay

### 示例图 ###
[Eureka + Ribbon + Config + Zuul + Hystrix 示例图点击查看](https://images.hzmedia.com.cn/xiandu/springcloud_921/Images/t10-1.jpg?v=20180921165736)

### 组件列表 ###
- Eureka <br/>
注册中心
- Ribbon <br/>
客户端负载均衡
- Config <br/>
配置中心
- Zuul <br/>
网关
- Hystrix <br/>
熔断器

### 项目地址 ###
[GitHub](https://github.com/FrankCy/cloud.git)

### 启动说明 ###
- 顺序 <br/>
cloud-eureka-server -> cloud-zuul -> cloud-data -> cloud-client



