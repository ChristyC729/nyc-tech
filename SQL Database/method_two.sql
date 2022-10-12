-- METHOD_TWO:
    -- Show the top 3 average government debts in percent of the gdp_per_capita (govt_debt/gdp_per_capita) for those countries of which gdp_per_capita was over 40,000 dollars in every year in the last four years.
    -- Calculates the average government debts in percent of gdp_per_capita of all available years for each country where gdp_per_capita was over 40,000 dollars for every year in the last four years. Then finds the top 3 countries from those averages. 
SELECT code, AVG(govt_debt/gdp_per_capita)*100 AS average_percent
FROM countries 
WHERE code in (SELECT code
FROM countries AS c2
WHERE year> 2018
GROUP BY code
HAVING COUNT(code) = 4 AND MIN(gdp_per_capita) > 40000)
GROUP BY code
ORDER BY average_percent DESC
LIMIT 3