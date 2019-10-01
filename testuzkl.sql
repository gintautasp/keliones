SELECT SQL_CALC_FOUND_ROWS 
	`keliones`.*
FROM 
	`keliones` 
LEFT JOIN 
	`klientai_keliones` ON ( 
			`keliones`.`id`=`klientai_keliones`.`keliones_id`
		AND 
			`klientai_keliones`.`klientai_id`=1
	) 
LEFT JOIN `klientai` ON ( 

	`klientai`.`id`=1
) 
WHERE 
		`klientai_keliones`.`id` IS NULL
	AND 
		`klientai`.`flag_poilsines`=`keliones`.`flag_poilsines`
	AND 
		`klientai`.`flag_pazintines`=`keliones`.`flag_pazintines`
	AND 
		`klientai`.`flag_viskas_isk`=`keliones`.`flag_viskas_isk`
	AND 
		`klientai`.`flag_laisv_pasir`=`keliones`.`flag_laisv_pasir`	
	GROUP BY
		`keliones`.`id` 