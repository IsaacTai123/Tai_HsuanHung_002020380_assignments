# Travel Planner Application

## Overview  

The Travel Planner App allows users to create, save, and view trip profiles. Users can create a new trip profile and save it. After saving, all input fields are cleared for a new entry. View the last saved trip using the view button.

## Attributes

Allow users to create and view trip profiles. Each trip profile will must include the following 14 attributes:

1. Trip Name
2. Destination
3. Start Date
4. End Date
5. Budget
6. Number of Travelers
7. Mode of Transportation
8. Accommodation Type (e.g., Hotel, Airbnb, Camping)
9. Emergency Contact Number
10. Notes/Description
11. Traveler Email
12. Traveler Phone Number
13. Booking Reference Number
14. Status (e.g., Planned, Ongoing, Completed)
15. exchangeRate
16. favoritesSpots
17. packingList
18. insurance
19. tripPurpose
20. visaRequirement

## Development Process

To avoid repetitive code when setting and retrieving values, I try to use loops and dynamic method to automate these process. leveraged **Reflection** to dynamically access the corresponding getter and setter methods in the `TripProfile` object.

This way, instead of manually calling `setName(txtName.getText())` for each field, the program automatically finds and invokes the correct method based on the field name. This approach made the code cleaner, more scalable, and easier to update in the future.

