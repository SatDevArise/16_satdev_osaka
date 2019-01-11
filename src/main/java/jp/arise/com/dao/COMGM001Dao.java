package jp.arise.com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.arise.com.dto.COMGM001Dto;
import jp.arise.utl.LoginInfoDto;

/**
 * COMGM001 ログイン画面用サービス間Daoクラス データベースアクセス時に利用するクラス
 *
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Repository
public class COMGM001Dao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	 /**
	 * ログインユーザー情報取得
	 * @return LoginInfoDto
	 */
	public LoginInfoDto getLoginInfo(COMGM001Dto COMGM001Dto) {

		StringBuilder sb = new StringBuilder();

		sb.append("SELECT");
		sb.append("  user_id");
		sb.append("  , user_na");
		sb.append("  , TO_CHAR(CURRENT_DATE, 'YYYYMMDD') AS unyoubi ");
		sb.append("FROM");
		sb.append("  login_user_dt ");
		sb.append("WHERE");
		sb.append("  user_id = :userId ");
		sb.append("  AND password = :password ");
		sb.append("  AND yuko_fg = '1'");

		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("userId", COMGM001Dto.getUser_id())
				.addValue("password", COMGM001Dto.getPassword());

		try {

			return jdbcTemplate.queryForObject(sb.toString(),
					param,
					new BeanPropertyRowMapper<LoginInfoDto>(LoginInfoDto.class));

		} catch (EmptyResultDataAccessException e) {

			return null;

		}
	}

	 /**
	 * ログイン履歴存在チェック
	 * @return -
	 */
	public String getRireki(LoginInfoDto loginInfoDto) {

		StringBuilder sb = new StringBuilder();

		sb.append("SELECT");
		sb.append("  user_id");
		sb.append("FROM");
		sb.append("  login_rireki_dt ");
		sb.append("WHERE");
		sb.append("  user_id = :userId ");
		sb.append("  AND yuko_fg = '1'");

		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("userId", loginInfoDto.getUser_id());

		try {

			String result = jdbcTemplate.queryForObject(sb.toString(),
					param,String.class);

			return result;

		} catch (EmptyResultDataAccessException e) {

			return null;

		}

	}

	 /**
	 * ログイン履歴作成処理
	 * @return -
	 */
	public int createRireki(LoginInfoDto loginInfoDto) {

		StringBuilder sb = new StringBuilder();

		sb.append("INSERT ");
		sb.append("INTO login_rireki_dt ");
		sb.append("VALUES ( ");
		sb.append("  :userId");
		sb.append("  , :userNa");
		sb.append("  , TO_CHAR(CURRENT_DATE, 'YYYYMMDD')");
		sb.append("  , ''");
		sb.append("  , '1'");
		sb.append("  , '1'");
		sb.append("  , :userId");
		sb.append("  , TO_CHAR(CURRENT_DATE, 'YYYYMMDD')");
		sb.append("  , ''");
		sb.append("  , ''");
		sb.append("  , ''");
		sb.append("  , ''");
		sb.append(") ");

		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("userId", loginInfoDto.getUser_id())
				.addValue("userNa", loginInfoDto.getUser_na());

		try {

			return jdbcTemplate.update(sb.toString(),param);

		} catch (EmptyResultDataAccessException e) {

			return 0;

		}
	}

	 /**
	 * ログイン履歴更新処理
	 * @return -
	 */
	public int updateRireki(LoginInfoDto loginInfoDto) {

		StringBuilder sb = new StringBuilder();

		sb.append("UPDATE login_rireki_dt ");
		sb.append("SET");
		sb.append("  login_date = TO_CHAR(CURRENT_DATE, 'YYYYMMDD')");
		sb.append("  , update_user = :userId");
		sb.append("  , update_ts = TO_CHAR(CURRENT_DATE, 'YYYYMMDD') ");
		sb.append("WHERE");
		sb.append("  user_id = :userId ");
		sb.append("  AND yuko_fg = '1'");

		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("userId", loginInfoDto.getUser_id());

		try {

			return jdbcTemplate.update(sb.toString(),param);

		} catch (EmptyResultDataAccessException e) {

			return 0;

		}
	}
	// /**
	// * ログインユーザー情報取得
	// * @return LoginInfoDto
	// */
	// public LoginInfoDto getLoginInfo(COMGM001Dto COMGM001Dto);
	//
	// /**
	// * ログイン履歴存在チェック
	// * @return -
	// */
	// public String getRireki(LoginInfoDto loginInfoDto);
	//
	// /**
	// * ログイン履歴作成処理
	// * @return -
	// */
	// public void createRireki(LoginInfoDto loginInfoDto);
	//
	// /**
	// * ログイン履歴更新処理
	// * @return -
	// */
	// public void updateRireki(LoginInfoDto loginInfoDto);

}
