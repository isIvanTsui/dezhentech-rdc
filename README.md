<h1 align="center">RDC项目</h1>

🏡

### 目录结构:file_folder:

```
dezhentech-rdc:
    │  
    ├─rdc-admin------------------微服务监控中心
    │  
    ├─rdc-api
    │  │ 
    │  ├─rdc-api-service-a-------serviceA Api
    │  │ 
    │  └─rdc-api-service-b-------serviceB Api
    │       ......
    ├─rdc-gateway----------------微服务网关
    │ 
    └─rdc-service
        │ 
        ├─rdc-service-a-----------A服务
        │ 
        └─rdc-service-b-----------B服务
        │  ........
```

### 技术选型:wrench:

- 核心依赖：`SpringBoot2.6.11`、`SpringCloud2021.0.4`、`SpringCloudAlibaba2021.0.4.0`.......
- 组件依赖：`zipkin2.2.8.RELEASE`、`nacos2.0.4`、`seata1.5.2`、`sentinel1.8.5`.........
- 其他依赖：`redisson3.17.1`、`MybatisPlus3.5.1`、`hutools5.8.0`、`knife4j3.0.3`......

<table border="2" >
	<tr>
        <td align=center bgcolor=#GREEN>注册中心</td>
		<td align =center>Nacos</td>
        <td align=center bgcolor=#GREEN>配置中心</td>
		<td align =center>Nacos</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>网关</td>
		<td align =center>SpringCloudGateway</td>
        <td align=center bgcolor=#GREEN>服务调用</td>
		<td align =center>OpenFeign</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>流控</td>
		<td align =center>Sentinel</td>
        <td align=center bgcolor=#GREEN>分布式事务</td>
		<td align =center>Seata</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>分布式缓存</td>
		<td align =center>Redis</td>
        <td align=center bgcolor=#GREEN>分布式锁</td>
		<td align =center>Redisson</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>持久层访问</td>
		<td align =center>MyBatisPlus</td>
        <td align=center bgcolor=#GREEN>接口文档</td>
		<td align =center>Knife4j</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>数据库同步</td>
		<td align =center>Canal</td>
        <td align=center bgcolor=#GREEN>全文检索</td>
		<td align =center>ElasticSearch</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>任务调度</td>
		<td align =center>  </td>
        <td align=center bgcolor=#GREEN>消息队列</td>
		<td align =center></td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>文件上传</td>
		<td align =center>  </td>
	</tr>
</table>

### 服务端口

|       服务       |     服务名      | 端口 |        备注        |
| :--------------: | :-------------: | :--: | :----------------: |
|    微服务网关    |  `rdc-gateway`  | 8090 |    统一请求入口    |
|  微服务监控中心  |   `rdc-admin`   | 8100 | 监控各服务健康状况 |
| 链路追踪管理中心 |    `zipkin`     | 9411 |      链路追踪      |
| 流量防护管理中心 |   `sentinel`    | 8080 |   限流、熔断降级   |
|      A服务       | `rdc-service-a` | 8091 |                    |
|      B服务       | `rdc-service-b` | 8092 |                    |

