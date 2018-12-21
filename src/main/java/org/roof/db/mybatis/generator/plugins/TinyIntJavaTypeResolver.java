package org.roof.db.mybatis.generator.plugins;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

/**
 * @author liuxin
 * @since 2018-12-21
 */
public class TinyIntJavaTypeResolver extends JavaTypeResolverDefaultImpl {
    public TinyIntJavaTypeResolver() {
        super.typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
