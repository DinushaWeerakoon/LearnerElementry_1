package com.example.dell.learnerintermediate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;


public class MainLearnerActivity extends ActionBarActivity {

    private static final String TAG_BTN_FAVOURITES = "favourites";
    private static final String TAG_BTN_COMMUNITY = "community";
    private static final String TAG_BTN_ACTIVITIES = "activities";

    private static final String TAG_LESSON_1 = "01 - Getting to know others,R.drawable.lesson_1";
    private static final String TAG_LESSON_2 = "02 - Time and Life,R.drawable.lesson_1";
    private static final String TAG_LESSON_3 = "03 - Giving Directions,R.drawable.lesson_1";
    private static final String TAG_LESSON_4 = "04 - Memories and Ambitions,R.drawable.lesson_1";
    private static final String TAG_LESSON_5 = "05 - Permissions,R.drawable.lesson_1";
    private static final String TAG_LESSON_6 = "06 - Good Old Days,R.drawable.lesson_1";
    private static final String TAG_LESSON_7 = "07 - Me and My Neighbour,R.drawable.lesson_1";
    private static final String TAG_LESSON_8 = "08 - Nature,R.drawable.lesson_1";
    private static final String TAG_LESSON_9 = "09 - Making the Impossible Possible,R.drawable.lesson_1";
    private static final String TAG_LESSON_10 = "10 - It’s your Choice,R.drawable.lesson_1";
    private static final String TAG_LESSON_11 = "11 - Why didn’t you?,R.drawable.lesson_1";
    private static final String TAG_LESSON_12 = "12 - How much? How many?,R.drawable.lesson_1";
    private static final String TAG_LESSON_13 = "13 - I was told that...,R.drawable.lesson_1";
    private static final String TAG_LESSON_14 = "14 - It was getting dark and……,R.drawable.lesson_1";
    private static final String TAG_LESSON_15 = "15 - Mechanics of writing,R.drawable.lesson_1";
    private static final String TAG_LESSON_16 = "16 - Reading at a glance,R.drawable.lesson_1";
    private static final String TAG_LESSON_17 = "17 - Hello,R.drawable.lesson_1";
    private static final String TAG_LESSON_18 = "18 - News around us,R.drawable.lesson_1";
    private static final String TAG_LESSON_19 = "19 - Ready to Twist Your Tongue?!!!,R.drawable.lesson_1";
    private static final String TAG_LESSON_20 = "20 - Using the Dictionary to Build Word Power,R.drawable.lesson_1";
    private static final String TAG_LESSON_21 = "21 - I was eagerly waiting,R.drawable.lesson_1";
    private static final String TAG_LESSON_22 = "22 - A Team,R.drawable.lesson_1";

    //To display the scroll tab content
    static ViewPager viewPager = null;

    //First We Declare Titles And Icons For Our Navigation Drawer List View
    //This Icons And Titles Are holded in an Array as you can see

    String TITLES[] = {"01 - Getting to know each other","02 - Time and Life","03 - Giving Directions","04 - Memories and Ambitions","05 - Permissions","06 - Good Old Days","07 - Me and My Neighbour","08 - Nature","09 - Making the Impossible Possible","10 - It’s your Choice","11 - Why didn’t you?","12 - How much? How many?", "13 - I was told that...","14 - It was getting dark and……", "15 - Mechanics of writing", "16 - Reading at a glance", "17 - Hello", "18 - News around us", "19 - Ready to Twist Your Tongue?!!!", "20 - Using the Dictionary to Build Word Power", "21 - I was eagerly waiting", "22 - A Team"};
    int ICONS[] = {R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1,R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1,  R.drawable.lesson_1,R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1, R.drawable.lesson_1};

    //Similarly we Create a String Resource for the name and email in the header view
    //And we also create a int resource for profile picture in the header view

    String NAME = "Akash Bangad";
    String EMAIL = "akash.bangad@android4devs.com";
    int PROFILE = R.drawable.bmark;

    private Toolbar toolbar;                              // Declaring the Toolbar Object

    private ScaleGestureDetector mScaleDetector;

    RecyclerView mRecyclerView;                           // Declaring RecyclerView
    RecyclerView.Adapter mAdapter;                        // Declaring Adapter For Recycler View
    RecyclerView.LayoutManager mLayoutManager;            // Declaring Layout Manager as a linear layout manager
    DrawerLayout Drawer;                                  // Declaring DrawerLayout

    ActionBarDrawerToggle mDrawerToggle;                  // Declaring Action Bar Drawer Toggle

    // Declare database helper object
    DatabaseAdapter dbAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_learner);

        //  Creates database object
        dbAdapter = new DatabaseAdapter(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager = (ViewPager) findViewById(R.id.main_pager);
        viewPager.setAdapter(new HomePagerAdapter(fragmentManager));


    /* Assinging the toolbar object ot the view
    and setting the the Action bar to our toolbar
     */
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);




        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView); // Assigning the RecyclerView Object to the xml View

        mRecyclerView.setHasFixedSize(true);                            // Letting the system know that the list objects are of fixed size

        mAdapter = new RecyclerAdapter(TITLES, ICONS, NAME,EMAIL,PROFILE);       // Creating the Adapter of RecyclerAdapter class(which we are going to see in a bit)
        // And passing the titles,icons,header view name, header view email,
        // and header view profile picture

        mRecyclerView.setAdapter(mAdapter);                              // Setting the adapter to RecyclerView




        final GestureDetector mGestureDetector = new GestureDetector(MainLearnerActivity.this, new GestureDetector.SimpleOnGestureListener() {

            @Override public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }

        });


        mRecyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                View child = recyclerView.findChildViewUnder(motionEvent.getX(),motionEvent.getY());



                if(child!=null && mGestureDetector.onTouchEvent(motionEvent)){
                    Drawer.closeDrawers();

                    if(recyclerView.getChildAdapterPosition(child)==1)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson01PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_1);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==2)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson02PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_2);

                    }

                    if(recyclerView.getChildAdapterPosition(child)==3)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson03PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_3);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==4)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson04PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_4);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==5)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson05PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_5);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==6)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson06PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_6);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==7)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson07PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_7);
                    }
                    if(recyclerView.getChildAdapterPosition(child)==8)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson08PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_8);
                    }
                    if(recyclerView.getChildAdapterPosition(child)==9)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson09PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_9);
                    }
                    if(recyclerView.getChildAdapterPosition(child)==10)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson10PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_10);
                    }
                    if(recyclerView.getChildAdapterPosition(child)==11)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson11PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_11);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==12)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson12PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_12);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==13)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson13PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_13);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==14)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson14PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_14);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==15)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson15PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_15);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==16)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson16PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_16);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==17)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson17PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_17);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==18)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson18PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_18);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==19)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson19PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_19);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==20)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson20PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_20);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==21)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson21PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_21);
                    }

                    if(recyclerView.getChildAdapterPosition(child)==22)
                    {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        viewPager = (ViewPager) findViewById(R.id.main_pager);
                        viewPager.setAdapter(new Lesson22PagerAdapter(fragmentManager));
                        viewPager.setTag(TAG_LESSON_22);
                    }

                    //Toast.makeText(MainLearnerActivity.this,"The Item Clicked is: "+recyclerView.getChildPosition(child), Toast.LENGTH_SHORT).show();

                    return true;

                }

                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean b) {

            }
        });



        mLayoutManager = new LinearLayoutManager(this);                 // Creating a layout Manager

        mRecyclerView.setLayoutManager(mLayoutManager);                 // Setting the layout Manager


        Drawer = (DrawerLayout) findViewById(R.id.DrawerLayout);        // Drawer object Assigned to the view
        mDrawerToggle = new ActionBarDrawerToggle(this,Drawer,toolbar,R.string.openDrawer,R.string.closeDrawer){

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                // code here will execute once the drawer is opened( As I dont want anything happened whe drawer is
                // open I am not going to put anything here)
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                // Code here will execute once drawer is closed
            }



        }; // Drawer Toggle Object Made
        Drawer.setDrawerListener(mDrawerToggle); // Drawer Listener set to the Drawer toggle
        mDrawerToggle.syncState();               // Finally we set the drawer toggle sync State

        //buildFAB();
    }

    /*private void buildFAB(){

        // Starts the content for FAB (Floating Action Button)

        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageResource(R.drawable.play);

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();


        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);

        ImageView icon_favourites = new ImageView(this); // Creates the icon menu for favourites
        icon_favourites.setImageResource(R.drawable.favourites);

        ImageView icon_activities = new ImageView(this); // Creates the icon menu for activities
        icon_activities.setImageResource(R.drawable.activities);

        ImageView icon_community = new ImageView(this); // Creates the icon menu for community
        icon_community.setImageResource(R.drawable.community);

        SubActionButton btnFavourites = itemBuilder.setContentView(icon_favourites).build();
        SubActionButton btnActivities = itemBuilder.setContentView(icon_activities).build();
        SubActionButton btnCommunity = itemBuilder.setContentView(icon_community).build();

        //Set onClick listeners for each sub action button..
        btnFavourites.setOnClickListener(this);
        btnActivities.setOnClickListener(this);
        btnCommunity.setOnClickListener(this);

        btnFavourites.setTag(TAG_BTN_FAVOURITES);
        btnActivities.setTag(TAG_BTN_ACTIVITIES);
        btnCommunity.setTag(TAG_BTN_COMMUNITY);

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(btnFavourites)
                .addSubActionView(btnActivities)
                .addSubActionView(btnCommunity)
                .attachTo(actionButton)
                .build();

    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goActivities(View view) {
        viewPager.setCurrentItem(viewPager.getChildCount());
    }

    /*@Override
    public void onClick(View v) {

        if(v.getTag().equals(TAG_BTN_ACTIVITIES)){
            viewPager.setCurrentItem(viewPager.getChildCount());
        }

        if(v.getTag().equals(TAG_BTN_COMMUNITY)){

//            String result = dbAdapter.getFavourites();
//            LearnerMessages.message(this, result);
//
//            Intent loadFavourites = new Intent(this, FavouritesActivity.class);
//            startActivity(loadFavourites);
        }

        if(v.getTag().equals(TAG_BTN_FAVOURITES)){

            long returnId = dbAdapter.insertFavourites(viewPager.getTag().toString());
            if(returnId > 0){
                LearnerMessages.message(this, "Lesson added to favourites.");
            }
            else
            {
                LearnerMessages.message(this, "Failed to add to favourites.");
            }
        }

    }*/
}
