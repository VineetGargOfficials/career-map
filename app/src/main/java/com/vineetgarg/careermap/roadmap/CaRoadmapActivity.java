package com.vineetgarg.careermap.roadmap;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.vineetgarg.careermap.R;

public class CaRoadmapActivity extends AppCompatActivity {

    CardView cardView;
    TextView txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt18, txt19, txt20,txt21, txt22, txt23, txt24, txt25, txt26, txt27, txt28, txt29, txt30, txt31, txt32, txt33, txt34, txt35, txt36, txt37, txt38, txt39, txt40, txt41, txt42, txt43, txt44, txt45, txt46, txt47, txt48, txt49, txt50, txt51, txt52, txt53, txt54;
    TextView cardContent, cardTitle;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ca_roadmap);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        txt5 = findViewById(R.id.textView1);
        txt6 = findViewById(R.id.textView101);
        txt7 = findViewById(R.id.textView102);
        txt8 = findViewById(R.id.textView103);
        txt9 = findViewById(R.id.textView9);
        txt10 = findViewById(R.id.textView104);
        txt11 = findViewById(R.id.textView11);
        txt12 = findViewById(R.id.textView2);
        txt13 = findViewById(R.id.textView105);
        txt14 = findViewById(R.id.textView107);
        txt15 = findViewById(R.id.textView109);
        txt16 = findViewById(R.id.textView106);
        txt18 = findViewById(R.id.textView108);
        txt19 = findViewById(R.id.textView110);
        txt20 = findViewById(R.id.textView111);
        txt21 = findViewById(R.id.textView115);
        txt22 = findViewById(R.id.textView113);
        txt23 = findViewById(R.id.textView112);
        txt24 = findViewById(R.id.textView114);
        txt25 = findViewById(R.id.textView116);
        txt26 = findViewById(R.id.textView4);
        txt27 = findViewById(R.id.textView3);
        txt28 = findViewById(R.id.textView136);
        txt29 = findViewById(R.id.textView119);
        txt30 = findViewById(R.id.textView118);
        txt31 = findViewById(R.id.textView120);
        txt32 = findViewById(R.id.textView135);
        txt33 = findViewById(R.id.textView5);
        txt34 = findViewById(R.id.textView121);
        txt35 = findViewById(R.id.textView117);
        txt36 = findViewById(R.id.textView123);
        txt37 = findViewById(R.id.textView125);
        txt38 = findViewById(R.id.textView122);
        txt39 = findViewById(R.id.textView124);
        txt40 = findViewById(R.id.textView126);
        txt41 = findViewById(R.id.textView6);
        txt42 = findViewById(R.id.textView127);
        txt43 = findViewById(R.id.textView129);
        txt44 = findViewById(R.id.textView133);
        txt45 = findViewById(R.id.textView131);
        txt46 = findViewById(R.id.textView46);
        txt47 = findViewById(R.id.textView7);
        txt48 = findViewById(R.id.textView128);
        txt49 = findViewById(R.id.textView130);
        txt50 = findViewById(R.id.textView50);
        txt51 = findViewById(R.id.textView132);
        txt52 = findViewById(R.id.textView134);
        txt53 = findViewById(R.id.textView53);
        txt54 = findViewById(R.id.textView54);

        cardView = findViewById(R.id.cardView);
        back = findViewById(R.id.backBtn);
        cardContent = findViewById(R.id.cardContent);
        cardTitle = findViewById(R.id.cardTitle);


        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt6.getText().toString();
                cardTitle.setText(title);
                String content = "Business transactions in California encompass exchanges of goods, services, or resources impacting a company's finances. They adhere to Generally Accepted Accounting Principles (GAAP) or relevant standards. Transactions involve debiting and crediting accounts for balance. Proper documentation includes invoices, receipts, and contracts. Recording utilizes journals and ledgers, reflecting in financial statements. Tax implications necessitate compliance with federal, state, and local laws. Legal adherence involves state regulations like the California Uniform Commercial Code (UCC). Understanding and managing transactions are pivotal for financial health and legal compliance, requiring meticulous planning and accurate record-keeping.";
                cardContent.setText(content);
            }

        });
        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt7.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, managing profit and loss is foundational. Chartered Accountants analyze revenue streams, expenses, and cost structures to determine profitability. They prepare profit and loss statements, also known as income statements, to depict a company's financial performance over a specific period. Chartered Accountants assess factors influencing profit margins, such as pricing strategies, operational efficiency, and market dynamics. They provide strategic advice on cost management, revenue enhancement, and profit optimization for businesses. Through financial analysis, forecasting, and performance evaluation, Chartered Accountants help businesses identify opportunities for growth, mitigate risks, and achieve sustainable profitability.";
                cardContent.setText(content);
            }

        });
        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt8.getText().toString();
                cardTitle.setText(title);
                String content = "Preparing financial statements in California involves compiling income statements, balance sheets, and cash flow statements according to Generally Accepted Accounting Principles (GAAP) or applicable standards. This process includes gathering transaction data, reconciling accounts, and adjusting entries. Income statements depict revenue, expenses, and net income over a specific period. Balance sheets detail assets, liabilities, and equity at a given point in time. Cash flow statements outline cash inflows and outflows from operating, investing, and financing activities. Compliance with state laws and regulations, along with accurate financial reporting, is crucial for businesses operating in California to ensure transparency and regulatory adherence.";
                cardContent.setText(content);
            }

        });
        txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt9.getText().toString();
                cardTitle.setText(title);
                String content = "Depreciation in California, as in any jurisdiction, refers to the systematic allocation of the cost of tangible assets over their useful lives for accounting and tax purposes. Businesses spread the cost of assets such as machinery, equipment, buildings, and vehicles over their expected useful life to match the expense with the revenue they generate. Common methods of depreciation include straight-line, accelerated, and units-of-production. Understanding depreciation is essential for financial reporting compliance with Generally Accepted Accounting Principles (GAAP) and tax planning in accordance with California tax laws. Accurate depreciation calculations ensure proper financial statements and tax filings, optimizing financial management and regulatory compliance.";
                cardContent.setText(content);
            }

        });
        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt10.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, effectively managing work in progress (WIP) is crucial. Chartered Accountants oversee the accounting treatment and valuation of WIP for service-based or project-oriented businesses. They track costs incurred, revenue recognized, and completion percentage to accurately report WIP in financial statements. Chartered Accountants implement internal controls and procedures to monitor WIP inventory levels, minimize write-offs, and ensure accurate financial reporting. Through budgeting, forecasting, and variance analysis, they optimize WIP management for cost control and project profitability. Additionally, Chartered Accountants advise on WIP policies, methodologies, and best practices to enhance operational efficiency and financial performance for businesses.";
                cardContent.setText(content);
            }

        });
        txt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt11.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, addressing balance sheet irregularities is critical. Chartered Accountants identify and rectify discrepancies, such as misstatements or omissions, to ensure the accuracy and reliability of financial reporting. They conduct thorough analyses of balance sheet accounts, scrutinizing assets, liabilities, and equity components for inconsistencies or anomalies. Chartered Accountants investigate the root causes of irregularities, such as errors, fraud, or accounting irregularities, and implement corrective actions to mitigate risks and restore integrity to the balance sheet. Through forensic accounting techniques, internal controls enhancements, and compliance audits, they safeguard stakeholders' interests and uphold transparency and credibility in financial statements.";
                cardContent.setText(content);
            }

        });
        txt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt13.getText().toString();
                cardTitle.setText(title);
                String content = "Understanding business law in California is vital for entrepreneurs. It encompasses contracts, business formation, employment law, intellectual property, and taxation. Knowledge of legal requirements for various business structures, contract drafting, and compliance with labor laws is crucial. Protecting intellectual property through trademarks, copyrights, and patents is essential. Additionally, adherence to state and federal tax laws, including income tax and sales tax regulations, is necessary for legal compliance. Staying informed about legal obligations and seeking professional legal advice ensures smooth operations and mitigates legal risks for businesses in California.";
                cardContent.setText(content);
            }

        });
        txt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt14.getText().toString();
                cardTitle.setText(title);
                String content = "Intellectual property (IP) laws in California protect creations of the mind, including patents, trademarks, copyrights, and trade secrets. Understanding these laws is crucial for businesses to safeguard their innovations and brands. Patent protection applies to inventions, while trademarks protect logos, slogans, and brand names. Copyrights cover original works of authorship, such as books, music, and software. Trade secrets safeguard confidential information, like formulas or processes. Compliance with IP laws involves registration, licensing, and enforcement to prevent infringement. Businesses must navigate these legal frameworks to secure their competitive edge and avoid costly disputes in California's dynamic business environment.";
                cardContent.setText(content);
            }

        });
        txt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt15.getText().toString();
                cardTitle.setText(title);
                String content = "From an international law perspective in California, businesses navigate various legal frameworks governing international trade, investment, and disputes. Understanding treaties, trade agreements, and regulations is vital for global commerce. Compliance with international trade laws, including import/export regulations and sanctions, ensures lawful transactions. Businesses also consider international arbitration and dispute resolution mechanisms for resolving cross-border disputes. Intellectual property protection extends to international jurisdictions through treaties like the Berne Convention and WIPO agreements. With California's significant role in global trade and innovation, adherence to international legal standards fosters business growth and mitigates legal risks in the international arena.";
                cardContent.setText(content);
            }

        });
        txt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt16.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, navigating corporate laws is paramount. Chartered Accountants advise on compliance with company legislation, including formation, governance, and dissolution requirements. They interpret corporate laws, such as the Companies Act, to ensure proper corporate governance, board structures, and shareholder rights. Chartered Accountants facilitate company registrations, filings, and regulatory disclosures to regulatory authorities. They also assist in mergers, acquisitions, and restructuring transactions, ensuring compliance with legal and regulatory frameworks. Through corporate audits, due diligence, and legal compliance reviews, they mitigate legal risks and promote corporate integrity. Proficiency in corporate laws enables Chartered Accountants to guide businesses in adhering to regulatory requirements and fostering sustainable growth.";
                cardContent.setText(content);
            }

        });
        txt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt18.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, grasping contract law is crucial. Chartered Accountants interpret and apply contract principles to safeguard clients' interests in business agreements. They advise on contract drafting, negotiation, and review to ensure legal enforceability and clarity of terms. Chartered Accountants analyze contract risks, liabilities, and remedies, mitigating potential disputes and liabilities. They also assist in resolving contract breaches, disputes, and claims through mediation, arbitration, or litigation. Through contract compliance audits and due diligence, they ensure adherence to contractual obligations and regulatory requirements. Proficiency in contract law enables Chartered Accountants to protect clients' rights and interests in commercial transactions.";
                cardContent.setText(content);
            }

        });
        txt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt19.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, understanding environmental laws is essential. Chartered Accountants advise businesses on compliance with environmental regulations, such as pollution control, waste management, and resource conservation laws. They assess the financial implications of environmental regulations, including compliance costs, liabilities, and disclosure requirements. Chartered Accountants conduct environmental audits and due diligence to identify potential risks and liabilities associated with environmental non-compliance. They also assist in environmental reporting, disclosure, and sustainability reporting to stakeholders. Through strategic planning and risk management, Chartered Accountants help businesses mitigate environmental risks, enhance corporate reputation, and ensure compliance with legal and regulatory requirements for sustainable operations.";
                cardContent.setText(content);
            }

        });
        txt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt20.getText().toString();
                cardTitle.setText(title);
                String content = "In California, microeconomics focuses on individual economic agents' behavior, such as consumers, businesses, and markets within the state. It delves into pricing, supply and demand dynamics, and market structures impacting local businesses. Macroecomonics, on the other hand, examines the broader economy, including statewide factors like GDP growth, unemployment rates, inflation, and fiscal policies. Understanding both micro and macroeconomics in California is essential for businesses to make informed decisions, navigate economic fluctuations, and adapt to regulatory changes. It enables stakeholders to grasp the interplay between individual choices and overall economic trends, facilitating sustainable growth and resilience in California's dynamic economy.";
                cardContent.setText(content);
            }

        });
        txt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt21.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, understanding market structures and pricing dynamics is crucial. Market structures, such as perfect competition, monopolistic competition, oligopoly, and monopoly, influence pricing strategies and market behavior. Chartered Accountants analyze these structures to assess competitive forces, market power, and pricing flexibility. They evaluate cost structures, demand elasticity, and competitor actions to determine optimal pricing strategies for firms. Through cost-volume-profit analysis, pricing models, and market research, they help businesses set prices that maximize revenue and profitability while considering market conditions and customer preferences. Mastery of market structure and pricing enables Chartered Accountants to advise companies on effective pricing strategies and enhance their competitiveness in diverse market environments.";
                cardContent.setText(content);
            }

        });
        txt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt22.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, understanding the economics of firms and industries is paramount. It involves analyzing the production, cost, and revenue structures of individual companies within their respective sectors. Factors like market competition, demand elasticity, and regulatory influences shape firms' pricing strategies and profit margins. Industry analysis encompasses studying market trends, entry barriers, and technological advancements affecting the competitive landscape. Through financial modeling, risk assessment, and performance evaluation, Chartered Accountants provide insights for strategic decision-making and optimizing resource allocation. Mastery of firm and industry economics equips professionals to guide businesses towards profitability, sustainability, and competitiveness in dynamic market environments.";
                cardContent.setText(content);
            }

        });
        txt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt23.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, understanding the business cycle is fundamental. Chartered Accountants analyze economic fluctuations, including expansion, peak, contraction, and trough phases, to assess their impact on businesses. They interpret leading, lagging, and coincident economic indicators to anticipate changes in consumer demand, investment, and business activity. Chartered Accountants advise on financial planning, risk management, and performance evaluation to navigate different stages of the business cycle. Through budgeting, forecasting, and scenario analysis, they help businesses adapt strategies to capitalize on opportunities and mitigate risks arising from economic volatility. Proficiency in the business cycle enables Chartered Accountants to enhance financial resilience and optimize business outcomes.";
                cardContent.setText(content);
            }

        });
        txt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt24.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, demand analysis is integral. Chartered Accountants analyze consumer preferences, income levels, and market trends to assess demand for goods and services. They interpret demand elasticity, price sensitivity, and cross-price elasticity to understand the responsiveness of demand to changes in factors like price and income. Chartered Accountants conduct market research, surveys, and data analysis to forecast demand and inform business strategies. They provide insights on pricing strategies, product differentiation, and market positioning to optimize revenue and profitability. Through demand forecasting models and scenario analysis, they assist businesses in managing inventory, production, and resource allocation for effective demand management.";
                cardContent.setText(content);
            }

        });
        txt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt25.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, forecasting and decision-making are critical. Chartered Accountants utilize financial models, trend analysis, and scenario planning to forecast future financial performance and risks. They assess market trends, regulatory changes, and economic indicators to anticipate business challenges and opportunities. Chartered Accountants provide strategic insights and recommendations to support decision-making processes, such as investment proposals, capital budgeting, and business expansion plans. Through risk assessment, sensitivity analysis, and cost-benefit analysis, they help businesses evaluate alternative courses of action and optimize resource allocation. Proficiency in forecasting and decision-making enables Chartered Accountants to guide businesses in achieving their objectives and enhancing long-term sustainability.";
                cardContent.setText(content);
            }

        });
        txt28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt28.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, mastering Goods and Services Tax (GST) is pivotal. It involves expertise in GST laws, compliance, and implications for businesses. Chartered Accountants interpret GST regulations, classify goods and services, and determine tax liabilities. They provide strategic advice on GST planning, credits, and compliance to optimize tax efficiency for clients. Through GST audits, return filing, and reconciliations, they ensure adherence to statutory requirements and mitigate risks of non-compliance. Chartered Accountants also assist with GST registrations, assessments, and dispute resolution, facilitating seamless GST compliance and enhancing financial management for businesses. Proficiency in GST empowers Chartered Accountants to navigate tax complexities and deliver value-added services to clients.";
                cardContent.setText(content);
            }

        });
        txt29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt29.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, managing customs duty involves expertise in international trade regulations and tariffs. Chartered Accountants navigate customs laws to facilitate cross-border transactions while minimizing duty costs for businesses. They classify goods, determine customs valuation, and ensure compliance with import/export regulations. Through strategic planning, they optimize duty drawbacks, exemptions, and trade agreements to reduce tax liabilities. Chartered Accountants also assist with customs documentation, clearance procedures, and audits to ensure smooth customs operations. Their proficiency in dealing with customs duty enables businesses to navigate international trade complexities, enhance cost-efficiency, and maintain compliance with customs regulations for seamless cross-border operations.";
                cardContent.setText(content);
            }

        });
        txt30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt30.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, managing international taxation is essential. Chartered Accountants interpret tax treaties, transfer pricing regulations, and foreign tax laws to optimize cross-border tax planning for businesses. They assess tax implications of international transactions, including import/export duties, withholding taxes, and foreign tax credits. Chartered Accountants advise on structuring investments, repatriating profits, and managing tax risks in global operations. They facilitate compliance with reporting requirements, such as Foreign Account Tax Compliance Act (FATCA) and Common Reporting Standard (CRS). Through tax audits, advance pricing agreements, and tax dispute resolution, they help businesses navigate complex international tax landscapes and ensure tax efficiency while mitigating risks.";
                cardContent.setText(content);
            }

        });
        txt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt31.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, grasping business taxation is fundamental. Chartered Accountants interpret tax laws, regulations, and updates to advise businesses on tax planning, compliance, and optimization strategies. They assess tax implications of business structures, transactions, and operations, considering corporate income tax, sales tax, and other levies. Chartered Accountants optimize tax credits, deductions, and incentives to minimize tax liabilities while ensuring compliance with legal requirements. Through tax return preparation, filing, and representation, they facilitate compliance with tax authorities and mitigate risks of audits or penalties. Proficiency in business taxation enables Chartered Accountants to enhance financial management and strategic decision-making for businesses.";
                cardContent.setText(content);
            }

        });
        txt32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt32.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, navigating the taxation of virtual goods is emerging. Chartered Accountants interpret tax laws and regulations to assess the tax treatment of virtual goods, such as digital assets, virtual currencies, and in-game items. They analyze transactions involving virtual goods to determine their taxability, including income tax, sales tax, and value-added tax implications. Chartered Accountants advise on compliance with tax reporting requirements for virtual transactions, considering international tax considerations and evolving regulatory frameworks. Through continuous monitoring of tax developments and collaboration with legal experts, they help businesses navigate the complexities of virtual goods taxation while optimizing tax efficiency and mitigating compliance risks.";
                cardContent.setText(content);
            }

        });
        txt34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt34.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, assurance standards ensure the reliability of financial information and processes. Chartered Accountants adhere to international standards, such as International Standards on Auditing (ISA), to conduct audits, reviews, and compilations. They assess internal controls, risk management, and financial statements to provide assurance on accuracy and compliance. Through rigorous testing, documentation, and analysis, they verify the fairness of financial reporting for stakeholders. Assurance engagements also encompass attestation services, including agreed-upon procedures and compliance audits. Chartered Accountants uphold professional ethics, independence, and skepticism to maintain the integrity and credibility of assurance engagements, fostering trust in financial markets and business operations.";
                cardContent.setText(content);
            }

        });
        txt35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt35.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, mastering income tax laws is paramount. It entails comprehensive knowledge of tax regulations, allowances, exemptions, and filing requirements at local and national levels. Chartered Accountants interpret tax laws to optimize tax planning, minimize liabilities, and ensure compliance for individuals and businesses. They provide strategic advice on deductions, credits, and tax-efficient investment strategies. Through tax audits, returns preparation, and dispute resolution, they navigate complex tax codes to mitigate risks and maximize savings for clients. Proficiency in income tax laws empowers Chartered Accountants to offer tailored tax solutions, mitigate legal risks, and enhance financial outcomes for their clients' long-term success.";
                cardContent.setText(content);
            }

        });
        txt36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt36.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, mastering auditing techniques is essential. Chartered Accountants utilize various methods, including substantive testing, analytical procedures, and tests of controls, to evaluate financial statements and internal controls. They assess risks, plan audit procedures, and gather evidence to form opinions on financial reliability and compliance. Techniques like sampling, inquiry, observation, and reperformance ensure thorough examination of transactions and balances. Chartered Accountants apply professional judgment, skepticism, and analytical skills to detect errors, fraud, and non-compliance. Through continuous learning and training, they stay updated on evolving auditing standards and technologies, enhancing audit quality and providing value-added insights to clients.";
                cardContent.setText(content);
            }

        });
        txt37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt37.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, internal and external audits serve distinct yet complementary roles. Internal audits, conducted by an organization's internal audit function, evaluate internal controls, risk management, and operational efficiency. They provide management with insights for improving processes and governance. External audits, performed by independent Chartered Accountants, assess the accuracy and fairness of financial statements in accordance with auditing standards and regulations. They provide assurance to stakeholders, such as investors and regulators, on the reliability of financial information. Both internal and external audits enhance transparency, accountability, and confidence in organizational performance, ensuring effective governance and compliance with standards and regulations.";
                cardContent.setText(content);
            }

        });
        txt38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt38.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, statutory audit is pivotal. Chartered Accountants conduct independent examinations of financial statements to ensure compliance with statutory requirements and accounting standards. They verify the accuracy, completeness, and reliability of financial information, assessing internal controls, transactions, and disclosures. Chartered Accountants express opinions on the fairness of financial statements, providing assurance to stakeholders, including shareholders, regulators, and creditors. They follow auditing standards, such as International Standards on Auditing (ISA), to plan, execute, and report audit findings. Through risk assessment, testing, and documentation, they enhance transparency, accountability, and confidence in financial reporting for businesses and investors.";
                cardContent.setText(content);
            }

        });
        txt39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt39.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, comprehending the audit report is paramount. Chartered Accountants communicate findings and opinions on financial statements' fairness and compliance in the audit report. They summarize audit procedures, scope, and conclusions, providing stakeholders with assurance on financial reporting reliability. Chartered Accountants express opinions on whether financial statements present a true and fair view in accordance with auditing standards. They disclose material misstatements, internal control weaknesses, and other significant audit findings. Chartered Accountants offer recommendations for improvement, enhancing transparency and accountability. Through clear and concise reporting, they facilitate informed decision-making and trust in financial information for stakeholders.";
                cardContent.setText(content);
            }

        });
        txt40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt40.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, understanding forensic reports is essential. Chartered Accountants conduct forensic investigations to uncover financial irregularities, fraud, and misconduct. They analyze financial records, transactions, and evidence to identify fraudulent activities or legal breaches. Chartered Accountants document findings, methodologies, and conclusions in forensic reports, presenting evidence and supporting documentation. They provide expert opinions on matters such as embezzlement, asset misappropriation, and financial statement fraud. Chartered Accountants may testify as expert witnesses in legal proceedings based on forensic findings. Through thorough investigation and clear reporting, they assist clients in resolving disputes, mitigating risks, and pursuing legal remedies in cases of financial wrongdoing.";
                cardContent.setText(content);
            }

        });
        txt42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt42.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, comprehending the Companies Act is fundamental. It encompasses legal regulations governing the formation, management, and dissolution of companies. Chartered Accountants interpret and apply provisions related to corporate governance, financial reporting, and shareholder rights. They ensure compliance with statutory requirements for company registration, board meetings, and disclosures. Understanding provisions on capital structure, dividends, and mergers facilitates strategic decision-making for businesses. Chartered Accountants also navigate regulations on director duties, related-party transactions, and corporate social responsibility. Mastery of the Companies Act enables Chartered Accountants to uphold corporate integrity, protect stakeholders' interests, and promote sustainable business practices.";
                cardContent.setText(content);
            }

        });
        txt43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt43.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, handling SEBI guidelines is paramount. The Securities and Exchange Board of India (SEBI) regulates securities markets and protects investors' interests. Chartered Accountants interpret and implement SEBI regulations to ensure compliance for listed companies and market intermediaries. They advise on disclosure norms, insider trading regulations, and corporate governance requirements. Chartered Accountants assist in preparing offer documents, conducting due diligence, and complying with listing obligations. They also facilitate compliance with SEBI regulations for mutual funds, portfolio managers, and other market participants. Proficiency in SEBI guidelines enables Chartered Accountants to navigate regulatory complexities and foster transparency, integrity, and investor confidence in the capital markets.";
                cardContent.setText(content);
            }

        });
        txt44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt44.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, understanding Customs and Foreign Trade Policy (FTP) is vital. It involves expertise in import-export regulations, customs duties, and trade agreements. Chartered Accountants advise businesses on customs compliance, classification, valuation, and documentation requirements. They assist in availing benefits under FTP schemes, such as Duty Drawback, Export Promotion Capital Goods (EPCG), and Advance Authorization. Chartered Accountants facilitate customs clearance, licensing, and compliance audits for import-export transactions. They also provide strategic guidance on international trade negotiations, tariff structures, and trade barriers. Proficiency in Customs and FTP enables Chartered Accountants to optimize trade operations, mitigate risks, and enhance competitiveness for businesses in global markets.";
                cardContent.setText(content);
            }

        });
        txt45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt45.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, mastery of GST laws and procedures is essential. It encompasses a comprehensive understanding of Goods and Services Tax (GST) legislation, compliance requirements, and procedural aspects. Chartered Accountants interpret GST laws, including registration, invoicing, and return filing provisions. They advise businesses on GST rates, input tax credit eligibility, and compliance with GST rules. Chartered Accountants facilitate GST registration, return preparation, and compliance audits for clients. They also assist in GST assessments, appeals, and dispute resolution with tax authorities. Proficiency in GST laws and procedures enables Chartered Accountants to ensure compliance, optimize tax efficiency, and mitigate risks for businesses operating in the GST regime.";
                cardContent.setText(content);
            }

        });
        txt46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt46.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, interpreting GST principles is essential for navigating the complex tax landscape. Chartered Accountants apply principles like substance over form, economic realities, and legal interpretation to GST transactions. They analyze GST laws, notifications, and judicial precedents to interpret ambiguous provisions and determine tax implications. Chartered Accountants consider the intent of the law, industry practices, and judicial interpretations to ensure accurate GST treatment. Through continuous learning and professional judgment, they provide clients with reliable GST advice, mitigate risks of non-compliance, and optimize tax outcomes. Mastery of GST interpretation principles enhances Chartered Accountants' effectiveness in advising businesses and ensuring GST compliance.";
                cardContent.setText(content);
            }

        });
        txt48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt48.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, the Company Secretary plays a vital role in corporate governance and compliance. They advise on legal and regulatory matters, ensuring adherence to company law, securities regulations, and corporate governance principles. Company Secretaries facilitate board meetings, maintain corporate records, and ensure regulatory filings. They liaise with regulatory authorities, shareholders, and other stakeholders on behalf of the company. Company Secretaries also oversee corporate governance practices, ethics, and disclosure requirements. Through their expertise in company law and governance, they enhance transparency, accountability, and legal compliance within organizations, supporting Chartered Accountants in upholding corporate integrity and stakeholder confidence.";
                cardContent.setText(content);
            }

        });
        txt49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt49.getText().toString();
                cardTitle.setText(title);
                String content = "Incorporation is a pivotal process in Chartered Accountancy with significant consequences. Chartered Accountants advise on the selection of appropriate business structures, such as corporations or limited liability companies, considering legal, tax, and operational implications. They oversee incorporation procedures, including registration, drafting of memorandum and articles of association, and compliance with regulatory requirements. Chartered Accountants assess the financial and tax consequences of incorporation, including capitalization, ownership structure, and tax obligations. They also advise on governance, reporting, and compliance frameworks post-incorporation. Through strategic planning and compliance oversight, Chartered Accountants ensure businesses achieve legal recognition, operational efficiency, and regulatory compliance.";
                cardContent.setText(content);
            }

        });
        txt50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt50.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, comprehending the Bankruptcy Code is crucial. Chartered Accountants interpret and apply provisions of the bankruptcy law, facilitating debt resolution and restructuring for financially distressed entities. They advise on bankruptcy filing procedures, creditor rights, and debtor obligations under the code. Chartered Accountants assess the implications of bankruptcy proceedings on stakeholders, including creditors, shareholders, and employees. They provide strategic guidance on debt restructuring, liquidation, and insolvency resolution processes. Through financial analysis, negotiation, and compliance, Chartered Accountants navigate the complexities of the Bankruptcy Code, aiming to achieve equitable debt resolution and financial recovery for businesses while ensuring legal compliance.";
                cardContent.setText(content);
            }

        });
        txt51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt51.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, understanding Advance Ruling in GST is vital. Chartered Accountants facilitate clients' applications for Advance Rulings to seek clarity on GST implications of specific transactions or interpretations of law. They analyze facts, assess legal provisions, and prepare comprehensive submissions for Advance Ruling authorities. Chartered Accountants navigate the Advance Ruling process, including hearings and consultations, to obtain binding decisions on GST matters. They interpret Advance Rulings to provide clients with certainty and guidance for tax planning, compliance, and risk mitigation strategies. Through expertise in GST law and procedures, Chartered Accountants assist businesses in leveraging Advance Rulings to ensure tax efficiency and regulatory compliance.";
                cardContent.setText(content);
            }

        });
        txt52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt52.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, managing Assessment and Audit under GST is paramount. Chartered Accountants assist businesses in responding to GST assessments conducted by tax authorities, ensuring compliance with GST laws and regulations. They represent clients during audit proceedings, providing documentation, explanations, and clarifications as required. Chartered Accountants conduct internal GST audits to identify compliance gaps, mitigate risks, and prepare for external audits. They also advise on GST audit procedures, record-keeping requirements, and reconciliation processes. Through proactive compliance measures and strategic guidance, Chartered Accountants help businesses navigate GST assessments and audits, minimizing tax liabilities and ensuring regulatory compliance.";
                cardContent.setText(content);
            }

        });
        txt53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt53.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, managing Appeals, Offences, and Penalties is critical. Chartered Accountants assist clients in challenging adverse tax decisions through appeals processes, including representation before appellate authorities and tribunals. They analyze legal provisions, case laws, and evidence to formulate effective appeal strategies. Chartered Accountants advise on compliance with tax laws to mitigate risks of offences and penalties, including late filing, non-payment, and tax evasion. They also provide guidance on penalty mitigation, voluntary disclosures, and settlement schemes to minimize financial liabilities. Through expertise in tax laws and dispute resolution, Chartered Accountants help businesses navigate appeals, avoid penalties, and resolve tax disputes efficiently.";
                cardContent.setText(content);
            }

        });
        txt54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt54.getText().toString();
                cardTitle.setText(title);
                String content = "In Chartered Accountancy, grasping cooperative governance is crucial. It involves overseeing the democratic management and operation of cooperative organizations. Chartered Accountants advise cooperatives on governance structures, bylaws, and member rights. They ensure compliance with cooperative principles, such as voluntary membership, democratic control, and equitable distribution of benefits. Chartered Accountants support financial transparency, accountability, and participatory decision-making within cooperatives. They assist in financial reporting, internal controls, and risk management to safeguard members' interests. Through governance audits and training, Chartered Accountants promote effective governance practices, fostering sustainability and socio-economic development in cooperative enterprises.";
                cardContent.setText(content);
            }

        });




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.GONE);
            }
        });
    }
}