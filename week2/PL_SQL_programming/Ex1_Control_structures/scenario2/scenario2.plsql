CREATE TABLE CUSTOMERS (
  customer_id NUMBER PRIMARY KEY,
  name        VARCHAR(50),
  age         NUMBER,
  balance     NUMBER,
  is_vip      VARCHAR(5) DEFAULT 'FALSE'
);

INSERT INTO CUSTOMERS (customer_id, name, age, balance) VALUES (1, 'Muzzammil', 65, 12000);
INSERT INTO CUSTOMERS (customer_id, name, age, balance) VALUES (2, 'Khader', 45, 9500);
INSERT INTO CUSTOMERS (customer_id, name, age, balance) VALUES (3, 'Asrar', 70, 15000);


COMMIT;

BEGIN
  FOR rec IN (
    SELECT customer_id, name, balance
    FROM CUSTOMERS
    WHERE balance > 10000
  ) LOOP
    UPDATE CUSTOMERS
    SET is_vip = 'TRUE'
    WHERE customer_id = rec.customer_id;

    DBMS_OUTPUT.PUT_LINE(rec.name || ' is now a VIP customer!');
  END LOOP;

  COMMIT;
END;
/

SELECT * FROM CUSTOMERS;

