interface WorkExperience {
    role: string;
    experiences: Array<{
        company: string;
        companyLink: string|undefined;
        job: string;
        proofLink: {
            href: string,
            text: string,
        } | undefined
        from: string;
        to: string;
    }>
}
