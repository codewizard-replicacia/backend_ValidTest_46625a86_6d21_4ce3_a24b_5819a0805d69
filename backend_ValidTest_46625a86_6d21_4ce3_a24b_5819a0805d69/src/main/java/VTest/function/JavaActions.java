package VTest.function;

import VTest.model.Document;
import VTest.model.ProductCatalogue;
import VTest.model.Vendor;
import VTest.model.Reorder;
import VTest.model.InventoryStock;
import VTest.model.PurchaseOrder;
import VTest.model.ProductStore;
import VTest.model.ProductCategory;




import VTest.enums.Product;
import VTest.converter.ProductConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  