package com.kpwang.sell.repository;

import com.kpwang.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kpwang
 * @create 2019-08-2019/8/28-23:35
 */
public interface OrderMasterRepository  extends JpaRepository<OrderMaster,String>{
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
