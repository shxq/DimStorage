Version 1.3
===========

- evolutions:
- [X] pouvoir renommer le DimChest comme un coffre
- [ ] objet d'acces a distance d'un DimChest (ender poutch like) (a reflechir)
- [ ] DimTank :D 
- [ ] integration de l'API ComputerCraft ( getOwner, getFreq, isLocked, setOwner, setPublic, setFreq ) + getItemInSlot (savoir quel item est dans quel slot)

- bugs:
- [ ] PRIORITAIRE: lance une partie, ouvre un coffre, change la frequence: si un stack est identique au precedent stack sur le meme slot alors rien ne s'affiche
- [ ] PRIORITAIRE: quitter et relancer rapidement ne sauvegarde pas les changements sur le DimChest
- [ ] il semble y avoir une baisse de FPS en ouvrant le coffre, peut etre du a l'animation d'ouverture du coffre
- [ ] En jouant sur un serveur, si on met a jour le DimChest (freq ou owner) via un ordinateur, l'inventaire est bien mis a jour
mais l'interface continue d'afficher les anciennes infos.
- [ ] Toujours sur un serveur, a la connexion du client les coffres sont tout noir (bug de lumiere je suppose).