<h1 align="center">RDCé¡¹ç®</h1>

ð¡

### ç®å½ç»æ:file_folder:

```
dezhentech-rdc:
    â  
    âârdc-admin------------------å¾®æå¡çæ§ä¸­å¿
    â  
    âârdc-api
    â  â 
    â  âârdc-api-service-a-------serviceA Api
    â  â 
    â  âârdc-api-service-b-------serviceB Api
    â       ......
    âârdc-gateway----------------å¾®æå¡ç½å³
    â 
    âârdc-service
        â 
        âârdc-service-a-----------Aæå¡
        â 
        âârdc-service-b-----------Bæå¡
        â  ........
```

### ææ¯éå:wrench:

- æ ¸å¿ä¾èµï¼`SpringBoot2.6.11`ã`SpringCloud2021.0.4`ã`SpringCloudAlibaba2021.0.4.0`.......
- ç»ä»¶ä¾èµï¼`zipkin2.2.8.RELEASE`ã`nacos2.0.4`ã`seata1.5.2`ã`sentinel1.8.5`.........
- å¶ä»ä¾èµï¼`redisson3.17.1`ã`MybatisPlus3.5.1`ã`hutools5.8.0`ã`knife4j3.0.3`......

<table border="2" >
	<tr>
        <td align=center bgcolor=#GREEN>æ³¨åä¸­å¿</td>
		<td align =center>Nacos</td>
        <td align=center bgcolor=#GREEN>éç½®ä¸­å¿</td>
		<td align =center>Nacos</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>ç½å³</td>
		<td align =center>SpringCloudGateway</td>
        <td align=center bgcolor=#GREEN>æå¡è°ç¨</td>
		<td align =center>OpenFeign</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>æµæ§</td>
		<td align =center>Sentinel</td>
        <td align=center bgcolor=#GREEN>åå¸å¼äºå¡</td>
		<td align =center>Seata</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>åå¸å¼ç¼å­</td>
		<td align =center>Redis</td>
        <td align=center bgcolor=#GREEN>åå¸å¼é</td>
		<td align =center>Redisson</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>æä¹å±è®¿é®</td>
		<td align =center>MyBatisPlus</td>
        <td align=center bgcolor=#GREEN>æ¥å£ææ¡£</td>
		<td align =center>Knife4j</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>æ°æ®åºåæ­¥</td>
		<td align =center>Canal</td>
        <td align=center bgcolor=#GREEN>å¨ææ£ç´¢</td>
		<td align =center>ElasticSearch</td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>ä»»å¡è°åº¦</td>
		<td align =center>  </td>
        <td align=center bgcolor=#GREEN>æ¶æ¯éå</td>
		<td align =center></td>
	</tr>
    <tr>
        <td align=center bgcolor=#GREEN>æä»¶ä¸ä¼ </td>
		<td align =center>  </td>
	</tr>
</table>

### æå¡ç«¯å£

|       æå¡       |     æå¡å      | ç«¯å£ |        å¤æ³¨        |
| :--------------: | :-------------: | :--: | :----------------: |
|    å¾®æå¡ç½å³    |  `rdc-gateway`  | 8090 |    ç»ä¸è¯·æ±å¥å£    |
|  å¾®æå¡çæ§ä¸­å¿  |   `rdc-admin`   | 8100 | çæ§åæå¡å¥åº·ç¶åµ |
| é¾è·¯è¿½è¸ªç®¡çä¸­å¿ |    `zipkin`     | 9411 |      é¾è·¯è¿½è¸ª      |
| æµéé²æ¤ç®¡çä¸­å¿ |   `sentinel`    | 8080 |   éæµãçæ­éçº§   |
|      Aæå¡       | `rdc-service-a` | 8091 |                    |
|      Bæå¡       | `rdc-service-b` | 8092 |                    |

