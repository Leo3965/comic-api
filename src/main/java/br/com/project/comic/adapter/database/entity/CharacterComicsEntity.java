package br.com.project.comic.adapter.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.*;

@Data
@Builder
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class CharacterComicsEntity {

    public static final String TABLE_NAME = "tb_comics";

    @Getter(onMethod_ = {@DynamoDbPartitionKey, @DynamoDbAttribute("PK")})
    public String pk;

    @Getter(onMethod_ = {@DynamoDbSortKey, @DynamoDbAttribute("SK")})
    public String sk;

    @Getter(onMethod_ = {@DynamoDbAttribute("type")})
    private String type;

    @Getter(onMethod_ = {@DynamoDbAttribute("nickname")})
    private String nickName;

    @Getter(onMethod_ = {@DynamoDbAttribute("real_name")})
    private String realName;

    @Getter(onMethod_ = {@DynamoDbAttribute("description")})
    private String description;

    @Getter(onMethod_ = {@DynamoDbAttribute("comic_id")})
    private String comicId;

    @Getter(onMethod_ = {@DynamoDbAttribute("title")})
    private String title;

}
