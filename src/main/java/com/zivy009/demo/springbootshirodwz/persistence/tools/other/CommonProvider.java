package com.zivy009.demo.springbootshirodwz.persistence.tools.other;

/**
 * @author zivy
 * @date 2017年7月12日
 * @describe
 */
public class CommonProvider {
/**
 * 也可以用 selec * from tableName where id=#{} and ... // #{} 可以防止sql注入
 * 
 *@author zivy
 *@date 2017年7月25日
 *@describe
 *@param sql
 *@return
 *
 */
    public String sql(String sql) {
        return sql;
    }
   
}
