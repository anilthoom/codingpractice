package com.anilt.jackson;

import com.anilt.jackson.model.TOCTree;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JacksonExploreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JacksonExploreApplication.class, args);
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "{\n" +
				"\t\"id\": 1,\n" +
				"\t\"name\": \"TBD-DANI BLA 01-Submission\",\n" +
				"\t\"opened\": false,\n" +
				"\t\"comment\": null,\n" +
				"\t\"dueDate\": null,\n" +
				"\t\"disabled\": false,\n" +
				"\t\"reviewer\": null,\n" +
				"\t\"selected\": false,\n" +
				"\t\"documents\": null,\n" +
				"\t\"attributes\": null,\n" +
				"\t\"childNodes\": [\n" +
				"\t\t{\n" +
				"\t\t\t\"id\": 2,\n" +
				"\t\t\t\"name\": \"m1-administrative-information-and-prescribing-information\",\n" +
				"\t\t\t\"opened\": false,\n" +
				"\t\t\t\"comment\": null,\n" +
				"\t\t\t\"dueDate\": null,\n" +
				"\t\t\t\"disabled\": false,\n" +
				"\t\t\t\"reviewer\": null,\n" +
				"\t\t\t\"selected\": true,\n" +
				"\t\t\t\"documents\": null,\n" +
				"\t\t\t\"attributes\": null,\n" +
				"\t\t\t\"childNodes\": null\n" +
				"\t\t}\n" +
				"\t]\n" +
				"}";

		//map json to tree
		try{
			TOCTree treeObj = mapper.readValue(jsonString, TOCTree.class);
			System.out.println(treeObj);

			String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(treeObj);
			System.out.println(result);

			//Tree node approach
			JsonNode rootNode = mapper.readTree(jsonString);
			System.out.println(rootNode.path("name").textValue());

			JsonNode childNode = rootNode.path("childNodes");
			Iterator<JsonNode> iterator = childNode.elements();
			while (iterator.hasNext()){
				System.out.println(iterator.next().elements().next());
			}
		}
		catch (JsonParseException e) { e.printStackTrace();}
		catch (JsonMappingException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
	}
}