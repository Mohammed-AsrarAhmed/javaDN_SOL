CREATE TABLE CUSTOMERS (
  customer_id NUMBER PRIMARY KEY,
  name        VARCHAR2(50)
);

CREATE TABLE LOANS (
  loan_id     NUMBER PRIMARY KEY,
  customer_id NUMBER,
  due_date    DATE,
  amount      NUMBER,
  FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(customer_id)
);

INSERT INTO CUSTOMERS VALUES (1, 'Asrar');
INSERT INTO CUSTOMERS VALUES (2, 'ahan');
INSERT INTO CUSTOMERS VALUES (3, 'maddy');

INSERT INTO LOANS VALUES (101, 1, SYSDATE + 10, 5000);
INSERT INTO LOANS VALUES (102, 2, SYSDATE + 40, 7000);
INSERT INTO LOANS VALUES (103, 3, SYSDATE + 20, 6000);
COMMIT;

BEGIN
  FOR rec IN (
    SELECT l.loan_id, l.due_date, c.name
    FROM LOANS l
    JOIN CUSTOMERS c ON l.customer_id = c.customer_id
    WHERE l.due_date <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan #' || rec.loan_id ||
                         ' for ' || rec.name ||
                         ' is due on ' ||rec.due_date);
  END LOOP;
END;
/

SELECT * FROM LOANS;

