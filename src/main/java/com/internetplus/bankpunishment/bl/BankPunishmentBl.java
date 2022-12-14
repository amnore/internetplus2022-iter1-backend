package com.internetplus.bankpunishment.bl;

import com.internetplus.bankpunishment.entity.BankPunishment;
import com.internetplus.bankpunishment.vo.BankPunishmentQueryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: bank-punishment
 * @description:
 * @author: xzh
 * @date: 2021-10-20
 **/
public interface BankPunishmentBl {
    Long insertBankPunishment(BankPunishment bankPunishment) throws Exception;

    public Integer uploadBankPunishmentByExcel(List<List<Object>> list) throws Exception;

    boolean updateBankPunishment(BankPunishment bankPunishment) throws Exception;

    boolean updateBankPunishmentExceptNull(BankPunishment bankPunishment) throws Exception;

    boolean deleteBankPunishment(Long id);

    boolean publishBankPunishment(Long id);

    int countAll();

    BankPunishment selectBankPunishmentById(Long id);

    List<BankPunishment> selectBankPunishmentByFuzzyQuery(String queryString);

    List<BankPunishment> selectBankPunishment(BankPunishmentQueryVO query);

    boolean filterDirtyBankPunishment();
}
