package jp.arise.sij.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.arise.sij.dto.SIJGM001Dto;

/**
 * SIJGM001 社員情報一覧表示画面用サービス間Daoクラス データベースアクセス時に利用するクラス
 *
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */

@Repository
public class SIJGM001Dao{

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public List<SIJGM001Dto> getSyainListInfo(SIJGM001Dto dto) {

		StringBuilder sb = new StringBuilder();

		sb.append("SELECT");
		sb.append("  sd.syain_id");
		sb.append("  , sd.genba_id");
		sb.append("  , sd.syain_na");
		sb.append("  , sd.syain_group_cd");
		sb.append("  , sd.nyusya_dt");
		sb.append("  , sd.genba_sankaku_dt");
		sb.append("  , sd.yakusyoku_cd");
		sb.append("  , sd.phase_cd");
		sb.append("  , sd.moyori_eki_1");
		sb.append("  , sd.moyori_eki_2");
		sb.append("  , sd.moyori_eki_3");
		sb.append("  , sd.siyo_rosen_na");
		sb.append("  , sd.syozoku_team");
		sb.append("  , sd.birth_dt");
		sb.append("  , sd.keika_ym");
		sb.append("  , sd.tanka_vl");
		sb.append("  , sd.zensyoku_na");
		sb.append("  , sd.syain_address");
		sb.append("  , sd.syussin_na");
		sb.append("  , sd.syain_renrakusaki");
		sb.append("  , gd.genba_na");
		sb.append("  , sd.yuko_fg");
		sb.append("  , sd.sakujo_fg ");
		sb.append("FROM");
		sb.append("  syain_dt sd ");
		sb.append("  LEFT JOIN ( ");
		sb.append("    SELECT");
		sb.append("      genba_id");
		sb.append("      , sakujo_fg");
		sb.append("      , MAX(genba_na) AS genba_na ");
		sb.append("    FROM");
		sb.append("      genba_dt ");
		sb.append("    GROUP BY");
		sb.append("      genba_id");
		sb.append("      , sakujo_fg");
		sb.append("  ) gd ");
		sb.append("    ON sd.genba_id = gd.genba_id ");
		sb.append("    AND gd.sakujo_fg = '0' ");
		sb.append("WHERE");
		sb.append("  sd.yuko_fg = '1' ");
		sb.append("  AND sd.sakujo_fg = '0' ");
		sb.append("ORDER BY");
		sb.append("  sd.syain_id");

		return jdbcTemplate.query(sb.toString(),
				new BeanPropertyRowMapper<SIJGM001Dto>(SIJGM001Dto.class));

	}

	// /**
	// * userを取得
	// * @return user
	// */
	// //public List<SIJGM001Dto> getUser(SIJGM001Dto SIJGM001Dto);
	//
	// /**
	// * 社員情報一覧を取得
	// * @param SIJGM001Dto
	// * @return getSyainListInfo
	// */
	// public List<SIJGM001Dto> getSyainListInfo();
}
