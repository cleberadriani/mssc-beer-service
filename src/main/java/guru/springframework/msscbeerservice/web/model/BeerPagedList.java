package guru.springframework.msscbeerservice.web.model;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class BeerPagedList extends PageImpl<Beerdto>{

    public BeerPagedList(List<Beerdto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<Beerdto> content) {
        super(content);
    }
    
}
