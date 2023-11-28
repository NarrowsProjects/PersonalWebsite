
export class RestAPI {
    private resourcesUrl: string = "http://localhost:8083/backend/worries/";

    constructor() {}

    async fetchJson(url: string, options: any = null): Promise<Array<Worry>|null> {
        let response = await fetch(url, options);
        if (response.ok) {
            return await response.json();
        } else {
            console.log(response, !response.bodyUsed ? await response.text() : "");
            return null;
        }
    }

    async asyncFindByNameAndType(name: string, type: string): Promise<Array<Worry>| null>  {
        return await this.fetchJson(`${this.resourcesUrl}byNameAndType/${name}/${type}`);
    }

    async asyncFindByName(name: string): Promise<Array<Worry>|null> {
        return await this.fetchJson(`${this.resourcesUrl}byName/${name}`);
    }
    async asyncFindByType(type: string): Promise<Array<Worry>| null>  {
        return await this.fetchJson(`${this.resourcesUrl}byType/${type}`);
    }

    async asyncFindAll(): Promise<Array<Worry>| null>  {
        const url = "http://localhost:8083/backend/worries";
        return await this.fetchJson(url);
    }

    async asyncSave(entity: Worry): Promise<Array<Worry>|null> {
        const url =
            this.resourcesUrl.slice(0, -1);
        const method = "POST";

        const options: any = {
            method,
            headers: {
                "Content-Type": "application/json",
            },
        };

        options.body = JSON.stringify(entity);
        console.log( options.body)
        return await this.fetchJson(url, options);
    }
}