# 项目介绍
使用idea+jdk17开发
使用springboot
# 需求分析
## 放漂流瓶

将漂流瓶信息放入数据库

漂流瓶字段：
drift_bottle

| 字段名    | 字段描述 | 字段类型     | 字段取值范围     |
| --------- | -------- | ------------ | ---------------- |
| content   | 内容     | varchar()    | 5000             |
| put_time  | 放入时间 | datetime     |                  |
| take_time | 拿出时间 | datetime     |                  |
| status    | 状态     | short        | 放入为0，拿出为1 |
| put_name  | 存放人   | varchar()    | 100              |
| id        | 主键     | int unsigned |                  |



## 捡漂流瓶
随机捡一个

# 接口文档

放漂流瓶：

- 基本信息

    ```
    请求路径：/put

    请求方式：POST

    接口详情：放置一个漂流瓶
	```

- 请求参数

    参数格式：application/json

    参数说明：

    | 名称    | 类型   | 是否必须 | 备注            |
    | ------- | ------ | -------- | --------------- |
    | content | string | 是       |                 |
    | putName | string | 否       | 若无则自动名为# |

    请求数据样例：

    ```json
    {
    	"content" : "你还好吗",
    	"putName" : "小c"
    }
    ```

    

- 响应数据

    参数格式：application/json
    	
    参数说明：

    | 名称 | 类型     | 是否必须 | 备注                           |
    | ---- | -------- | -------- | ------------------------------ |
    | code | number   | 必须     | 响应码，1 代表成功，0 代表失败 |
    | msg  | string   | 非必须   | 提示信息                       |
    | data | object[] | 非必须   | 返回的数据                     |
    
    响应数据样例：
    
    ```json
    {
      "code": 1,
      "msg": "success"
    }
    ```

捡漂流瓶：
- 基本信息

    ```
    请求路径：/take

    请求方式：GET

    接口详情：拿取一个漂流瓶
	```

- 请求参数

    参数格式：无

- 响应数据

    参数格式：application/json
    	
    参数说明：

    | 名称 | 类型     | 是否必须 | 备注                           |
    | ---- | -------- | -------- | ------------------------------ |
    | code | number   | 必须     | 响应码，1 代表成功，0 代表失败 |
    | msg  | string   | 非必须   | 提示信息                       |
    | data | object[] | 非必须   | 返回的数据                     |
    
    响应数据样例：
    
    ```json
    {
      "code": 1,
      "msg": "success",
      "data":{
          "content":"你好吗"，
          "putName":"小c"
      }
    }
    ```