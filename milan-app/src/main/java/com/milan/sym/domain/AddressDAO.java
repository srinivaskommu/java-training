package com.milan.sym.domain;

import com.milan.domain.ioc.Address;

public interface AddressDAO {

	void createAddress(Long customerId, Address address);

}
