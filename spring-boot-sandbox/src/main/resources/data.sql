INSERT INTO customer_company (identifier, title) VALUES
  ('01361308', 'Tak Wah Electronic Limited'),
  ('09235168', 'Rice''s Trading LLC'),
  ('06608439', 'Daniels Brothers LLC'),
  ('04982395', 'Lam Kee Logistic Limited'),
  ('07601293', 'Catherine Consultants Inc.');

INSERT INTO account (status, balance, customer_id, bank_identifier) VALUES
  ('closed', '796.29', 2, 'AE-AD-0790-U'),
  ('suspended', '749.03', 3, 'AC-EA-3882-P'),
  ('active', '91.68', 1, 'BC-EA-5527-M'),
  ('active', '575.35', 4, 'FA-FF-6005-Z'),
  ('suspended', '18.58', 5, 'FB-CA-1965-B');