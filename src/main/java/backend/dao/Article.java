package backend.dao;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(type = "article_type", indexName = "article", shards = 2, refreshInterval = "-1")
public class Article {
    @Id Integer id;
    @Field String author;
    @Field String content;
}
