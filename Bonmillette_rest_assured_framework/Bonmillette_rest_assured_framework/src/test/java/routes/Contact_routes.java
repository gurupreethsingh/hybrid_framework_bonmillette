package routes;

public class Contact_routes {
public static String base_url="http://localhost:3006";
	
	public static String post_create_message_url = base_url+"/api/add-contact-message";
	
	public static String get_fetch_all_messages_url = base_url+"/api/all-messages";
	
	public static String get_fetch_message_by_id_url = base_url+"/api/reply-message/:id";
	
	public static String post_give_reply_to_message_url = base_url+"/api/give-message-reply/:id/reply";
	
	public static String get_total_message_unreadcount_url = base_url+"/api/messages/unread-count";
	
	public static String post_total_messages_mark_as_read_url = base_url+"/api/messages/mark-as-read";
	
	public static String get_total_message_count_url = base_url+"/api/messages/get-messages-count";

}
   