class Parts
{
  float xPos;
  
  float yPos;
  
  int width = 2;
  
  int height = 2;
  
  Boolean horizon;
  
  Boolean old_horizon;
  
  Parts(float xPos_init, float yPos_init, int width_init, int height_init, Boolean horizon_init, Boolean old_horizon_init)
  {
    this.xPos = xPos_init;
    this.yPos = yPos_init;
    this.width = width_init;
    this.height = height_init;
    this.horizon = horizon_init;
    this.old_horizon = old_horizon_init;
  }
  
  void swap()
  {
      int old_width = this.width;
      this.width = this.height;
      this.height = old_width;
      this.old_horizon = this.horizon;
  }
  
    
}
