USE dbodbc;
DELIMITER $$
DROP PROCEDURE IF EXISTS TRAER_TELEFONO_POR_USUARIO $$
CREATE PROCEDURE TRAER_TELEFONO_POR_USUARIO(
	_nombre VARCHAR(250),
	_apellido VARCHAR(250)
 )

BEGIN
SELECT telefono FROM Usuario
WHERE usuario.nombre = _nombre and usuario.apellido = _apellido;

END
$$ 
DELIMITER ;

CALL TRAER_TELEFONO_POR_USUARIO("PAblo","Violi");
