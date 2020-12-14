Create or replace procedure Transfer(
  fromPerson int,
  toPerson int,
  amount dec
)
LANGUAGE PLPGSQL
AS $$
BEGIN
update Accounts set balance = balance - amount where id = fromPerson;
update Accounts set balance = balance + amount where id = toPerson;
COMMIT;
END; $$

call Transfer(1,2,100);