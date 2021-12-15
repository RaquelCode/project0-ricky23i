package com.PokeBox.app;

import io.javalin.Javalin;
import static io.javalin.apibuilder.ApiBuilder.*;

public class PokeBoxApp {
	public static void main(String[] args) {
		Javalin app = Javalin.create();

		app.start();

		app.routes(() -> {
			path(" ", () -> {
				get(ctx -> {
				});
				post(ctx -> {
				});
				path(" ", () -> {
					get(ctx -> {
					});
					put(ctx -> {
					});
				});

				path(" ", () -> {
					get(ctx -> {
					});
				});

				path(" ", () -> {
					get(ctx -> {
					});
				});
			});
		});

	}
}
