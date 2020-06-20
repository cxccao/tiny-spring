package cxc.tinyioc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }
}
