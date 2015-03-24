class Target
{
  float xPos;
  float yPos;
  int width;
  int height;

  Target(int width_init, int height_init)
  {
    this.width = width_init;
    this.height = height_init;
  }
  void drawTarget(Snake_game processing)
  {
    processing.rect(this.xPos, this.yPos, this.width, this.height);
  }
  void generate(Snake_game processing)
  {
    this.xPos = processing.random(5, processing.width-5);
    this.yPos = processing.random(5, processing.height-5);
    processing.eaten = false;
    processing.println(this.xPos);
    processing.println(this.yPos);
  }

  void eaten(Snake_game processing, float xPos_head, float yPos_head, String last_direct, float width_parts, float height_parts)
  {
    if (last_direct.equals("LEFT"))
    {
      if (calc(xPos_head, yPos_head, width_parts, height_parts) == true)
      {

        processing.eaten = true;
      }
    }
    if (last_direct.equals("RIGHT"))
    {
      if (calc(xPos_head+width_parts, yPos_head, width_parts, height_parts) == true)
      {
        processing.eaten = true;
      }
    }
    if (last_direct.equals("UP"))
    {
      if (calc(xPos_head, yPos_head, height_parts, width_parts) == true)
      {
        processing.eaten = true;
      }
    }
    if ( last_direct.equals("DOWN"))
    {
      if (calc(xPos_head, yPos_head+ width_parts, height_parts, width_parts) == true)
      {
        processing.eaten = true;
      }
    }
  }

  Boolean calc(float xHead, float yHead, float width_parts, float height_parts)
  {
    if (xHead< this.xPos && this.xPos < xHead+width_parts && yHead < this.yPos && this.yPos < yHead+height_parts)
    {
      return true;
    } else if (xHead< this.xPos && this.xPos < xHead+width_parts && yHead < this.yPos+this.height && this.yPos+this.height < yHead+height_parts)
    {
      return true;
    } else if (xHead < this.xPos+this.width && this.xPos+this.width < xHead+width_parts && yHead < this.yPos && this.yPos < yHead+height_parts)
    {
      return true;
    } else if (xHead < this.xPos+this.width && this.xPos+this.width < xHead+width_parts && yHead < this.yPos+this.height && this.yPos+this.height < yHead+height_parts)
    {
      return true;
    } else if (xHead < this.xPos+this.width/2 && this.xPos+this.width/2 < xHead+width_parts && yHead < this.yPos+this.height/2 && this.yPos+this.height/2 < yHead+height_parts)
    {
      return true;
    }else
    {
      return false;
    }
  }
}
