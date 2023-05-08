import {test} from '@playwright/test';

test('Open Clarity', async ({page}) => {
    await page.goto('https://auto1.clarityfalcon.com/');
    await page.getByPlaceholder('Enter your email').fill("admin@clarity.com")
    await page.getByPlaceholder('Enter your password').fill("Clr2021!1234")
    await page.getByRole('button', {name: 'Sign In'}).click();
    await page.getByTestId('globalSearchForUserCompany').fill("TMC")
});
