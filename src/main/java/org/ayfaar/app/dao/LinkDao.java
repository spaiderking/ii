package org.ayfaar.app.dao;

import org.ayfaar.app.model.Link;
import org.ayfaar.app.model.UID;

import java.util.List;

public interface LinkDao extends BasicCrudDao<Link> {
    List<Link> getAliases(String uri);

    UID getPrimeForAlias(String uri);

    List<Link> getRelated(String uri);

    Link getForAbbreviation(String uri);

    List<Link> getRelatedWithQuote(String uri);
}
