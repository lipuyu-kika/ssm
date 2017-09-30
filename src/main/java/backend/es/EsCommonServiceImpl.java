package backend.es;

import lombok.extern.log4j.Log4j2;
import org.elasticsearch.action.update.UpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.data.elasticsearch.core.query.UpdateQuery;
import org.springframework.data.elasticsearch.core.query.UpdateQueryBuilder;

import java.io.IOException;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;
import backend.dao.Article;
import org.springframework.stereotype.Service;


@Log4j2
@Service
public class EsCommonServiceImpl implements EsCommonService{
    @Autowired ElasticsearchTemplate elasticsearchTemplate;
    @Override
    public void addDoc(String id){
        /*
        try {
            UpdateRequest updateRequest = new UpdateRequest()
                    .index("us")
                    .type("user")
                    .id("2")
                    .doc(jsonBuilder().startObject()
                            .field("name", "buzhidao")
                            .endObject());
            elasticsearchTemplate.getClient().update(updateRequest);
        }catch (IOException ie){
            System.out.println("hello world!!!!error");
        }*/
        Article o = new Article("1", "jibuzhu123");
        IndexQuery indexQuery = new IndexQueryBuilder().withId(id).withObject(o).build();
        elasticsearchTemplate.index(indexQuery);
    }
}
