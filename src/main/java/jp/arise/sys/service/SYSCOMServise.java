package jp.arise.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.sys.dao.SYSCOMDao;
import jp.arise.sys.dto.SYSCOMDto;

/**
 * SYSCOM メニュー画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class SYSCOMServise {

	@Autowired
	private SYSCOMDao SYSCOMDao;


	public SYSCOMDto inputCheck(SYSCOMDto dto) {
//        String user = dto.getUser();
//
//
//        dto.setUserId(2);
//
//        List<SYSCOMDto> resultList = SYSCOMDao.getUser(dto);

		return dto;
	}
}
