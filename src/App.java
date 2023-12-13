import java.util.*;

public class App {
    public static String[][] races = {{"Human","Human","Human","Beastkin","Xenith","Runii","Doppleganger","Angel","Asura","Witchborn"},{"Halfling","Dwarf","Gremlin","Daemon","Drakekin","Oread","Salamander","Elemental","Esper","Possess Worm"},{"Gnome","Elves","Pixie","Lamia","Tengu","Dryad","Harpy","Centaur","Inversion","Reflection"},{"Goblin","Hobgoblin","Vermint","Orc","Minotaur","Nereid","Ogre","Troll","Ettin","Swarm"},{"Kobold","Feline","Satyr","Gnoll","Avian","Djinni","Kitsune","Werewolf","Sphinx","Dual"},{"Imp","Lizardkin","Amphian","Insectoid","Merfolk","Oni","Drider","Deep One","Succubus","Miniscule"},{"Ghoul","Patchwork","Undead","Golem","Clockwork","Slime","Vampire","Spectre","Harpy","Wendigo"},{"Gemini","Fungith","Wendigo","Star Spawn","Mimic","Kappa","Tanuki","Chimera","Dhampir","Respawner"},{"Phoenix","Treant","Prinny","Ifrit","Manticore","Conrasu Void Plant","Apekin","Underbred","Mummy","Shapeshift"},{"Colossus","Brood Mother","Evolver","Eldritch One","Hive Monarch","Genius Loci","Subtle Lord","High Dragon","Kaiju","Glitch"}};
    public static String[][] classes={{"Fighter","Bard","Rogue","Druid","Mage","Cleric","Psion","Diabolist","Gaoler","Villager"},{"Knight","Witch","Thief","Ranger","Wizard","Cultist","Sage","Hell Knight","Templar","Merchant"},{"Barbarian","Skald","Assassin","Hunter","Sorcerer","Alchemist","Engineer","Brew Bottler","Dungeoneer","Guard"},{"Paladin","Commander","Monk","Trapper","Warlock","Runesmith","Warlord","Swarm Keeper","Brigand","Questor"},{"Samurai","Shaman","Swash Buckler","Ninja","Enchanter","Chaplain","Skin Walker","Ink Shaper","Pit Fighter","Job changes per day"},{"Myrmidon","Spy","Scout","Beast Master","Chaos Caller","Inquisitor","Detective","Master Mutator","Scar Bearer","Observer"},{"Dragoon","Mutant","Gambler","Metamorph","Summoner","Elementalist","Survivalist","Hex Blade","Tinkerer","Lynchpin"},{"Bulwark","Jester","Sniper","Gunslinger","Necromancer","Artificer","Dream Weaver","Arcanist","Law Bringer","Villain"},{"Juggernaut","Fable Wright","Nameless","Behemoth Binder","Chronomancer","Evangelist","Bloat Blood","Crimson Priest","Executioneer","Immortal"},{"Deathly Duelist","Legion Lord","Planes Walker","Nature Warden","Cataclysm","Contract Carver","Iron Breaker","Plague Bringer","Raid Reaper","World Shaper"}};
    public static String[][] backgrounds={{"Peasant","Trader","Entertainer","Common Hero","Guard","Noble","Lone Survivor","Vengeful Remnant","Bandit Bluff Chieftain","Iron Masked","Slave"},{"Apprentice","Scholar","Fugitive","Soldier","Charlatan","Drunken Hangover","Cartographer","Underground Monkey","Crate Maker"},{"Prisoner","Guild Fellow","Hermit","Bereaved","Scout","Courtier","Ex-Pirate","Coffin Fodder","Grand Arena Thrall","Cryptid"},{"Criminal","Artisan","Sailor","Outcast","Pit Fighter","Servant","Ghostly Presence","Town Razer","Scourge of The West","Wild Woodsman"},{"Urchin","Blacksmith","Outlander","Acolyte","Thug","Occultist","Weapon Spirit","Alien Podling","Mad Mage Recluse","True Villain Mastermind"},{"Wretch","Scribe","Wanderer","Retired","Poacher","Destined","Conspiracy's Pawn","Trainee Adventurer","Azure Lair Lord","Forest Mistress"},{"Wild Child","Unfrozen","Alchemically Made","Reincarnated","Adopted by Elite","Leashed Hound","Isekai","Fey Enchanted","Dark Cult Deity","Throne Bound Master"},{"Unwilling Sacrifice","Lost Workman","Cursed Princess","Faction Initiate","Infernal Resurecte","Plank Walker","Shadow Archetype","Summon Sidekick","Volcanic Tyrant","Slumbering Apocalypse"},{"Damsel in Distress","Travelling Scenes Merchant","Tavern Helpful Hireling","Death Flagged Mentor","Tragic Love Interest","Proud Dragon Slayer","Master Arcane Forger","Interplanar Warden","Daddy's Little Villain","Entrapping Breaker"},{"Experienced Trainer","Flesh Sculptor Barber","Escortee","Home Steader","Corrupt Clergy","Chronicler","Torch Candle Lighter","Doomed Ruler","Sealed Ancient Evil","Moderator"}};
    public static String[][] elements={{"Air","Water","Earth","Fire","Earth","Metal","Light","Darkness","Strength","Anti-Magic"},{"Lightning","Ice","Sand","Magma","Beast","Blood","Shadow","Time","Speed","Numbers"},{"Cloud","Acid","Crystal","Smoke","Poison","Mirror","Holy","Curse","Mind","Weaving"},{"Thunder","Frost","Swamp","Forge","Sakura","Gold","Psionic","Rot","Armour","Hunt"},{"Song","Dream","Balance","Ash","Fear","Magnetism","Memory","Prophecy","Sight","Growth"},{"Star","Moon","Gravity","Sun","Life","Death","Space","Void","Mass","Demon"},{"Gas","Slime","Construction","Chaos","Wild","Order","Rebirth","Undeath","Bonds","Eldritch"},{"Runic","Alchemy","Animation","Arcana","Charm","Fortune","Creation","Destruction","Clan","Egg"},{"Book","Size","Tech","Bomb","Candy","Weapon","Art","Pain","Wish","Gift"},{"Autumn","Winter","Spring","Summer","Flesh","Bone","Soul","Sin","Name","Binary"}};

    public static void main(String[] args) throws Exception {
        Scanner read=new Scanner(System.in);
        int choice=-1;
        while((choice!=0)){
            System.out.print("Chose an option: 1 to roll all, 2 to roll races only\n3 roll classes only, 4 roll backgrounds only \n5 roll elements only, 0 to exit\nChoice: ");
            choice=read.nextInt();
            if (choice==1) {
                System.out.println(charecter());
            }
            else if (choice==2) {
                //more options here
                int number = roll10();
                String hybrid;
                String race;
                if(number<=1){
                    hybrid="Purebreed";
                    race=rollitem(races);
                }
                else if(number<=5){
                    hybrid="Halfbreed";
                    race=rollitem(races)+"-"+rollitem(races);
                }
                else if(number<=8){
                    hybrid="Crossbreed";
                    race=rollitem(races)+"-"+rollitem(races)+"-"+rollitem(races);
                }
                else{
                    hybrid="Hybrid";
                    race=rollitem(races)+"-"+rollitem(races)+"-"+rollitem(races)+"-"+rollitem(races);
                }
                System.out.println(hybrid+" "+race);
            }
            else if (choice==3) {
                System.out.println(rollitem(classes));
            }
            else if (choice==4) {
                System.out.println(rollitem(backgrounds));
            }
            else if (choice==5) {
                System.out.println(rollitem(elements));
            }
        }
        read.close();
    }

    public static String rollitem(String[][] items){
        //should take in a list, and choose random result from it
        int group=(int)(Math.random()*items.length);
        int spot=(int)(Math.random()*items[group].length);
        return items[group][spot];
    }
    public static int roll10(){
        return (int)(Math.random()*10)+1;
    }
    
    public static String charecter(){
        // this is the one for whole charecter gen
        int number = roll10();
        String hybrid;
        String race;
        String background=rollitem(backgrounds);
        String element=rollitem(elements);
        String clas=rollitem(classes);
        if(number<=1){
            hybrid="Purebreed";
            race=rollitem(races);
        }
        else if(number<=5){
            hybrid="Halfbreed";
            race=rollitem(races)+"-"+rollitem(races);
        }
        else if(number<=8){
            hybrid="Crossbreed";
            race=rollitem(races)+"-"+rollitem(races)+"-"+rollitem(races);
        }
        else{
            hybrid="Hybrid";
            race=rollitem(races)+"-"+rollitem(races)+"-"+rollitem(races)+"-"+rollitem(races);
        }
        return "A "+hybrid+" "+race+", with the class of "+clas+" with background of "+background+" wielding "+element;
    }
}
