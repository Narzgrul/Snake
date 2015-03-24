class Snake
{
  float xPos_head;

  float yPos_head;

  int parts_number = 10;

  int parts_width = 8;

  int parts_height = 4;

  int counter = this.parts_number-1;

  int countertwo = 2;

  Boolean directionLeft = true;

  Boolean directionRight = false;

  Boolean directionUp = false;

  Boolean directionDown =false;

  String last_direct = "left";

  Boolean movementDone = false;

  Snake (float xPos_head_init, float yPos_head_init, int parts_number_init, int parts_width_init, int parts_height_init)
  {
    this.xPos_head = xPos_head_init;
    this.yPos_head = yPos_head_init;
    this.parts_number = parts_number_init;
    this.parts_width = parts_width_init;
    this.parts_height = parts_height_init;
  }
  Parts[] all_parts = new Parts[this.parts_number];
  Parts[] all_parts2 = new Parts[this.parts_number];

  void Snake_first()
  {
    this.all_parts = new Parts[this.parts_number];
    this.all_parts2 = new Parts[this.parts_number];
    for (int counter=0; counter<this.parts_number; counter++)
    {
      this.all_parts[counter] =new Parts(this.xPos_head+counter*this.parts_width, this.yPos_head, this.parts_width, this.parts_height, false, false);
    }
  }



  void bitten(Snake_game processing)
  {
    int antibug_counter = this.counter+1;
    if (antibug_counter > this.parts_number-1)
    {
      antibug_counter = 0;
    }
    for (int counter=0; counter < this.parts_number; counter++)
    {
      if (counter != antibug_counter)
      {
        if (this.all_parts[counter].horizon == false)
        {
          if (this.directionLeft == true || this.directionRight == true)
          {
            for (int counter_for = 0; counter_for < 20; counter_for ++)
            {
              if ((this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_width && this.xPos_head + counter_for/19*this.parts_width < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head && this.yPos_head < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head && this.xPos_head < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + counter_for/19*this.parts_height && this.yPos_head + counter_for/19*this.parts_height < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_width && this.xPos_head + counter_for/19*this.parts_width < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + this.parts_height && this.yPos_head + this.parts_height < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head + this.parts_width && this.xPos_head + this.parts_width < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + counter_for/19*this.parts_height && this.yPos_head + counter_for/19*this.parts_height < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_width && this.xPos_head + counter_for/19*this.parts_width < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + this.parts_height/3 && this.yPos_head + this.parts_height/3 < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_width && this.xPos_head + counter_for/19*this.parts_width < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + this.parts_height*2/3 && this.yPos_head + this.parts_height*2/3 < this.all_parts[counter].yPos + this.parts_height))
              {
                processing.bitten = true;
              }
            }
          } else if (this.directionUp == true || this.directionDown == true)
          {
            for (int counter_for = 0; counter_for < 20; counter_for ++)
            {
              if ((this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_height && this.xPos_head + counter_for/19*this.parts_height < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head && this.yPos_head < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head && this.xPos_head < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + counter_for/19*this.parts_width && this.yPos_head + counter_for/19*this.parts_width < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_height && this.xPos_head + counter_for/19*this.parts_height < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + this.parts_width && this.yPos_head + this.parts_width < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head + this.parts_height && this.xPos_head + this.parts_height < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + counter_for/19*this.parts_width && this.yPos_head + counter_for/19*this.parts_width < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_height && this.xPos_head + counter_for/19*this.parts_height < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + this.parts_width/3 && this.yPos_head + this.parts_width/3 < this.all_parts[counter].yPos + this.parts_height) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_height && this.xPos_head + counter_for/19*this.parts_height < this.all_parts[counter].xPos + this.parts_width && this.all_parts[counter].yPos < this.yPos_head + this.parts_width*2/3 && this.yPos_head + this.parts_width*2/3 < this.all_parts[counter].yPos + this.parts_height))
              {
                processing.bitten = true;
              }
            }
          }
        } else if (this.all_parts[counter].horizon == true)
        {        
          if (this.directionLeft == true || this.directionRight == true)
          {
            for (int counter_for = 0; counter_for < 20; counter_for ++)
            {
              if ((this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_width && this.xPos_head + counter_for/19*this.parts_width < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head && this.yPos_head < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head && this.xPos_head < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + counter_for/19*this.parts_height && this.yPos_head + counter_for/19*this.parts_height < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_width && this.xPos_head + counter_for/19*this.parts_width < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + this.parts_height && this.yPos_head + this.parts_height < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head + this.parts_width && this.xPos_head + this.parts_width < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + counter_for/19*this.parts_height && this.yPos_head + counter_for/19*this.parts_height < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_width && this.xPos_head + counter_for/19*this.parts_width < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + this.parts_height/3 && this.yPos_head + this.parts_height/3 < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_width && this.xPos_head + counter_for/19*this.parts_width < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + this.parts_height*2/3 && this.yPos_head + this.parts_height*2/3 < this.all_parts[counter].yPos + this.parts_width))
              {
                processing.bitten = true;
              }
            }
          } else if (this.directionUp == true || this.directionDown == true)
          {
            for (int counter_for = 0; counter_for < 20; counter_for ++)
            {
              if ((this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_height && this.xPos_head + counter_for/19*this.parts_height < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head && this.yPos_head < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head && this.xPos_head < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + counter_for/19*this.parts_width && this.yPos_head + counter_for/19*this.parts_width < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_height && this.xPos_head + counter_for/19*this.parts_height < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + this.parts_width && this.yPos_head + this.parts_width < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head + this.parts_height && this.xPos_head + this.parts_height < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + counter_for/19*this.parts_width && this.yPos_head + counter_for/19*this.parts_width < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_height && this.xPos_head + counter_for/19*this.parts_height < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + this.parts_width/3 && this.yPos_head + this.parts_width/3 < this.all_parts[counter].yPos + this.parts_width) ||
                (this.all_parts[counter].xPos < this.xPos_head + counter_for/19*this.parts_height && this.xPos_head + counter_for/19*this.parts_height < this.all_parts[counter].xPos + this.parts_height && this.all_parts[counter].yPos < this.yPos_head + this.parts_width*2/3 && this.yPos_head + this.parts_width*2/3 < this.all_parts[counter].yPos + this.parts_width))
              {
                processing.bitten = true;
              }
            }
          }
        }
      }
    }
  }


  void snake_grow()
  {
    int currentPart = this.counter+1;
    this.counter += 1;
    if (this.counter > this.parts_number-1)
    {
      this.counter = 0;
    }
    this.all_parts2 = new Parts[this.parts_number+1];
    for (int counter = 0; counter<this.parts_number+1; counter++)
    {
      all_parts2[counter] = new Parts(200, 200, this.parts_width, this.parts_height, false, false);
    }
    this.all_parts2[0].xPos = all_parts[this.counter].xPos;
    this.all_parts2[0].yPos = all_parts[this.counter].yPos;
    this.all_parts2[0].horizon= all_parts[this.counter].horizon;
    this.all_parts2[0].old_horizon = all_parts[this.counter].old_horizon;
    this.all_parts2[0].width = all_parts[this.counter].width;
    this.all_parts2[0].height = all_parts[this.counter].height;
    this.all_parts2[1].xPos =all_parts[this.counter].xPos;
    this.all_parts2[1].yPos = all_parts[this.counter].yPos;
    this.all_parts2[1].horizon= all_parts[this.counter].horizon;
    this.all_parts2[1].old_horizon = all_parts[this.counter].old_horizon;
    this.all_parts2[1].width = all_parts[this.counter].width;
    this.all_parts2[1].height = all_parts[this.counter].height;
    for (int counter = 2; counter < this.parts_number+1; counter++)
    { 
      if (currentPart> this.parts_number-1)
      {
        currentPart = 0;
      }
      this.all_parts2[counter].xPos = all_parts[currentPart].xPos;
      this.all_parts2[counter].yPos = all_parts[currentPart].yPos;
      this.all_parts2[counter].horizon = all_parts[currentPart].horizon;
      this.all_parts2[counter].old_horizon = all_parts[currentPart].old_horizon;
      this.all_parts2[counter].width = all_parts[currentPart].width;
      this.all_parts2[counter].height = all_parts[currentPart].height;
      currentPart++;
      if (currentPart > this.parts_number-1)
      {
        currentPart = 0;
      }
    }
    this.parts_number +=1;
    this.all_parts = new Parts[this.parts_number];
    for (int counter = 0; counter<this.parts_number; counter++)
    {
      all_parts[counter] = new Parts(200, 200, this.parts_width, this.parts_height, false, false);
    }
    this.counter = this.parts_number -1;
    for (int counter = 0; counter < this.parts_number; counter++)
    {
      this.all_parts[counter].xPos = all_parts2[counter].xPos;
      this.all_parts[counter].yPos = all_parts2[counter].yPos;
      this.all_parts[counter].horizon = all_parts2[counter].horizon;
      this.all_parts[counter].old_horizon = all_parts2[counter].old_horizon;
      this.all_parts[counter].width = all_parts2[counter].width;
      this.all_parts[counter].height = all_parts2[counter].height;
    }
  }


  void drawSnake(Snake_game processing)
  {
    processing.fill(0, 0, 0);

    for ( int counter=0; counter<this.parts_number; counter++)
    {
      processing.rect(all_parts[counter].xPos, all_parts[counter].yPos, all_parts[counter].width, all_parts[counter].height);
    }
  }

  void move(Snake_game processing)
  {
    if (this.countertwo == 0)
    {
      if (this.directionLeft == true)  //!!left movement!!
      {
        all_parts[this.counter].horizon = false;
        if (all_parts[this.counter].old_horizon == true)
        {
          all_parts[this.counter].swap();
        }
        if (this.last_direct.equals("UP"))
        {
          all_parts[this.counter].xPos = this.xPos_head-all_parts[this.counter].width;
          all_parts[this.counter].yPos = this.yPos_head;
        } else if (this.last_direct.equals("DOWN"))
        {
          all_parts[this.counter].yPos = this.yPos_head+all_parts[this.counter].width-all_parts[this.counter].height;
          all_parts[this.counter].xPos = this.xPos_head-all_parts[this.counter].width;
        } else
        {
          all_parts[this.counter].xPos = this.xPos_head-all_parts[this.counter].width;
          all_parts[this.counter].yPos = this.yPos_head;
        }        
        if (all_parts[this.counter].xPos<0)
        {
          all_parts[this.counter].xPos = processing.width-all_parts[this.counter].width;
        }
        this.xPos_head = all_parts[this.counter].xPos;
        this.yPos_head = all_parts[this.counter].yPos;
        this.last_direct = "LEFT";
      } else if (this.directionRight == true) //!!right movement!!
      {
        all_parts[this.counter].horizon = false;
        if (all_parts[this.counter].old_horizon == true)
        {
          all_parts[this.counter].swap();
        }
        if (this.last_direct.equals("UP"))
        {
          all_parts[this.counter].xPos = this.xPos_head+all_parts[this.counter].height;
          all_parts[this.counter].yPos = this.yPos_head;
        } else if (this.last_direct.equals("DOWN"))
        {
          all_parts[this.counter].xPos = this.xPos_head+all_parts[this.counter].height;
          all_parts[this.counter].yPos = this.yPos_head+all_parts[this.counter].width-all_parts[this.counter].height;
        } else
        {
          all_parts[this.counter].xPos = this.xPos_head+all_parts[this.counter].width;
          all_parts[this.counter].yPos = this.yPos_head;
        }
        if (all_parts[this.counter].xPos > processing.width)
        {
          all_parts[this.counter].xPos = 0;
        }
        this.xPos_head = all_parts[this.counter].xPos;
        this.yPos_head = all_parts[this.counter].yPos;
        this.last_direct = "RIGHT";
      } else if (this.directionUp == true)  //!!upper movement!!
      {
        all_parts[this.counter].horizon = true;
        if (all_parts[this.counter].old_horizon == false)
        {
          all_parts[this.counter].swap();
        }
        if (this.last_direct.equals("LEFT"))
        {
          all_parts[this.counter].yPos = this.yPos_head-all_parts[this.counter].height;
          all_parts[this.counter].xPos = this.xPos_head;
        } else if (this.last_direct.equals("RIGHT"))
        {
          all_parts[this.counter].xPos = this.xPos_head+all_parts[this.counter].height-all_parts[this.counter].width;
          all_parts[this.counter].yPos = this.yPos_head-all_parts[this.counter].height;
        } else
        {
          all_parts[this.counter].yPos = this.yPos_head-all_parts[this.counter].height;
          all_parts[this.counter].xPos = this.xPos_head;
        }      
        if (all_parts[this.counter].yPos < 0)
        {
          all_parts[this.counter].yPos = processing.height;
        }
        this.last_direct = "UP";
        this.xPos_head = all_parts[this.counter].xPos;
        this.yPos_head = all_parts[this.counter].yPos;
      } else if (this.directionDown == true) //!!lower movement!!
      {
        all_parts[this.counter].horizon = true;
        if (all_parts[this.counter].old_horizon == false)
        {
          all_parts[this.counter].swap();
        }
        if (this.last_direct.equals("RIGHT"))
        {
          all_parts[this.counter].xPos = this.xPos_head+all_parts[this.counter].height-all_parts[this.counter].width;
          all_parts[this.counter].yPos = this.yPos_head+all_parts[this.counter].width;
        } else if (this.last_direct.equals("LEFT"))
        {
          all_parts[this.counter].yPos = this.yPos_head+all_parts[this.counter].width;
          all_parts[this.counter].xPos = this.xPos_head;
        } else
        {
          all_parts[this.counter].yPos = this.yPos_head+all_parts[this.counter].height;
          all_parts[this.counter].xPos = this.xPos_head;
        }
        if (all_parts[this.counter].yPos > processing.height)
        {
          all_parts[this.counter].yPos = 0;
        }
        this.last_direct = "DOWN";
        this.xPos_head = all_parts[this.counter].xPos;
        this.yPos_head = all_parts[this.counter].yPos;
      }
      this.xPos_head = all_parts[counter].xPos;
      this.yPos_head = all_parts[counter].yPos;
      this.movementDone = false;
      if (counter == 0)
      {
        counter = this.parts_number;
      }
      counter--;
      this.countertwo = 4;
    } else
    {
      countertwo--;
    }
  }
  void keyPressedSnake(Snake_game processing)
  {
    if ( processing.game_stopped == false)
    {
      if (processing.keyCode == processing.UP && this.directionDown != true && this.movementDone == false)
      {
        this.directionUp = true;
        this.directionDown = false;
        this.directionLeft = false;
        this.directionRight = false;
        this.movementDone = true;
      }
      if (processing.keyCode == processing.DOWN && this.directionUp != true && this.movementDone == false)
      {
        this.directionUp = false;
        this.directionDown = true;
        this.directionLeft = false;
        this.directionRight = false;
        this.movementDone = true;
      }
      if (processing.keyCode == processing.RIGHT && this.directionLeft != true && this.movementDone == false)
      {
        this.directionUp = false;
        this.directionDown = false;
        this.directionLeft = false;
        this.directionRight = true;
        this.movementDone = true;
      }    
      if (processing.keyCode == processing.LEFT && this.directionRight != true && this.movementDone == false)
      {
        this.directionUp = false;
        this.directionDown = false;
        this.directionLeft = true;
        this.directionRight = false;
        this.movementDone = true;
      }
    }
  }
}
