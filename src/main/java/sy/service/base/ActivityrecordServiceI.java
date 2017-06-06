package sy.service.base;

import java.util.List;

import sy.model.base.Record;
import sy.service.BaseServiceI;
import sy.util.base.HqlFilter;

public interface ActivityrecordServiceI extends BaseServiceI<Record> {
	public List<Record> findRecordByFilter(HqlFilter hqlFilter);
}
