package cn.gyyx.testLcg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.XMemcachedClient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.gyyx.testLcg.BLL.GameBLL;
import cn.gyyx.testLcg.BLL.GameServerBLL;
import cn.gyyx.testLcg.model.Game;
import cn.gyyx.testLcg.model.GameServer;

@Controller("GameServerController") 
public class GameServerController {
//	private List<Game> games=new ArrayList<Game>();
//	private List<GameServer> gameServers=new ArrayList<GameServer>();
	
//	MemcachedClient client;
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
//	GameBLL gBLL;
//	GameServerBLL gsBLL;
	public GameServerController(){
//		gBLL=new GameBLL(); 
//		gsBLL=new GameServerBLL();
//		try {
//			client=new XMemcachedClient("192.168.6.195",10001);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	//查找游戏列表
//	@RequestMapping(value ="/games", method = RequestMethod.GET)
//	public String games(@CookieValue(value = "uuid", defaultValue = "0") String uuid,Model model) {
//		System.out.println("uuid================="+uuid);
//		String name="";
//		try {
//			name=client.get("\""+uuid+"\"");
//			System.out.println("memcachen:name = "+name);
//		} catch (TimeoutException e) {
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (MemcachedException e) {
//			e.printStackTrace();
//		}
//		if(null==name||"".equals(name)){
//			System.out.println("账号不存在");
//			return "redirect:/games/login";
//		}
		
//		games=gBLL.select();
//		model.addAttribute("games",games);
//		model.addAttribute("uuid", uuid);
//		return "Game/games";
//	}
	
	//查找服务器列表
//	@RequestMapping(value ="/servers", method = RequestMethod.GET)
//	public String servers(@CookieValue(value = "uuid", defaultValue = "0") String uuid,String game_id,Model model) {
//		System.out.println("uuid================="+uuid);
//		String name="";
//		try {
//			name=client.get("\""+uuid+"\"");
//			System.out.println("memcachen:name = "+name);
//		} catch (TimeoutException e) {
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (MemcachedException e) {
//			e.printStackTrace();
//		}
//		if(null==name||"".equals(name)){
//			System.out.println("账号不存在");
//			return "redirect:/games/login";
//		}
		
//		gameServers=gsBLL.select(game_id);
//		model.addAttribute("games",games);
//		model.addAttribute("uuid", uuid);
//		return "Game/games";
//	}
	
	
//	//添加
//	@RequestMapping(value="/games/add",method=RequestMethod.GET)
//	public String add(){ 
//		return "Game/add";
//	}
//	//添加
//	@RequestMapping(value="/games/add",method=RequestMethod.POST)
//	public String add(Game Game){
//		System.out.println(Game);
//		gBLL.insert(Game);
//		return "redirect:/games";
//	}
//	
//	
//	//删除
//	@RequestMapping(value="/games/delete",method=RequestMethod.GET)
//	public String delete(int id){
//		gBLL.delete(id);
//		return "redirect:/games";
//	}
//	
//	
//	//修改
//	@RequestMapping(value="/games/update",method=RequestMethod.GET)
//	public String update(int id,Model model)   {
//		model.addAttribute("id",id);
//		return "/Game/update";
//	}
//	//修改
//	@RequestMapping(value="/games/update",method=RequestMethod.POST)
//	public String update(Game Game){
//		System.out.println(Game);
//		gBLL.update(Game);
//		return "redirect:/games";
//	}
	
	
}
