# elastic-search-proxy
a simple proxy for elastic search.can multi cluster shunt by search scenario.also has rate limit

# why use
- don't want to expose clients
- use multi cluster for search

# components
## elastic-search-proxy-beans
- 包含查询、排序、提权相关bean定义
- 包含基础exception类型定义
- 包含查询响应相关bean定义
- 包含查询上下文
- 包含es客户端定义
## elastic-search-proxy-core
- 依赖  
    elastic-search-proxy-beans   
    elastic-search-proxy-config    
    elastic-search-proxy-sharding(可选)    
    elastic-search-proxy-limit(可选)
- 代理核心逻辑。代理上下文，整体集群、负载、限流组件初始化入口
- 查询模型入参校验
- 查询模型DSL过程封装
- 查询集群负载均衡(elastic-search-proxy-sharding)，动态负载变更
- 查询限流(elastic-search-proxy-limit)，动态限流变更
- 查询结果封装
