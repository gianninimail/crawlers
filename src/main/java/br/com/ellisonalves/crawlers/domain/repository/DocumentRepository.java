package br.com.ellisonalves.crawlers.domain.repository;

import br.com.ellisonalves.crawlers.application.crawlers.ExtractedData;
import br.com.ellisonalves.crawlers.domain.repository.shared.Insertable;

import java.io.Serializable;

/**
 * @author ellison
 */
public interface DocumentRepository extends Insertable<ExtractedData> {

}
