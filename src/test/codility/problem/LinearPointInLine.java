package test.codility.problem;

import test.codility.utils.Point;

import java.util.ArrayList;
import java.util.List;

public class LinearPointInLine {
	public LinearPointInLine(){
	    int[][] points ={ { 0,0 }, { 1,1 },{ 2,2 }, { 3,3 },{ 3,2 }, { 4,3 } ,{5,1}};
        List<Point> pointsList = convertToPoint(points);

        int counter = 0;

        for(int i=0;i<pointsList.size();i++){
            int j = i+1;
            while(j<pointsList.size()){
                int k = j+1;
                while(k<pointsList.size()){
                    boolean  match = checkPointInLine(pointsList.get(i),pointsList.get(j),pointsList.get(k));
                    if(match){
                        counter +=1;
                    }
                    k++;
                }
                j++;
            }
        }

        System.out.println(this.toString()+" ---> "+counter);

    }
    private List<Point> convertToPoint(int[][] inputPoints){
	    List pointsList = new ArrayList();
        for(int i=0;i<inputPoints.length;i++){
            Point point = new Point(inputPoints[i][0],inputPoints[i][1]);
            pointsList.add(point);

        }
        return pointsList;
    }

    private boolean checkPointInLine(Point pointA,Point pointB,Point pointC){


        if(pointA !=null || pointB!=null || pointC !=null){
            int x= pointC.getX();
            int y = pointC.getY();
            if((pointB.getX()-pointA.getX())== 0 ) return false;

            if(y  == ((pointB.getY()-pointA.getY())/(pointB.getX()-pointA.getX()))*(x-pointA.getX())+ pointA.getY()){

                return true;
            };

        }


	    return false;
    }
	
}
