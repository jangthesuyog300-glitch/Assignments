/*
DROP PROCEDURE IF EXISTS prol;


DELIMITER $

CREATE PROCEDURE prol()
BEGIN
  
    INSERT INTO dept VALUES (81, 'PQR', 'borad', 'xyz', '2001-01-21');
END $

DELIMITER ;*/

Drop PROCEDURE IF EXISTS prol;

DELIMITER $$
CREATE PROCEDURE Prol(IN last int)
/*
BEGIN 
   DELETE from dept where deptno = 81;
   SELECT "Delete successfully " as message;
   
END $*/

BEGIN
  DECLARE v_cnt INT DEFAULT 0;
  
  -- Get total count of rows in dept table
  SELECT COUNT(*) INTO v_cnt FROM dept;
  
  -- Select rows starting from (v_cnt - last) limit last rows
  -- This assumes you want last 'last' rows from dept, adjust as needed
  SELECT * FROM dept LIMIT v_cnt - last, last;
END $$ 
DELIMITER ;   
  