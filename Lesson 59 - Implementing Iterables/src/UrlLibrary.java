import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
    private LinkedList<String> listUrls = new LinkedList<String>();

    private class UrlIterator implements Iterator<String> {
        private int intIndex = 0;

        @Override
        public boolean hasNext() {
            return intIndex < listUrls.size();
        }

        @Override
        public String next() {
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(listUrls.get(intIndex));
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String strLine = null;

                while ((strLine = br.readLine()) != null) {
                    sb.append(strLine);
                    sb.append("\n");
                }

                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            intIndex++;
            return sb.toString();
        }

        @Override
        public void remove() {
            listUrls.remove(intIndex);
        }
    }

    public UrlLibrary() {
        listUrls.add("https://www.google.co.uk");
        listUrls.add("https://www.youtube.com");
        listUrls.add("https://www.udemy.com");
    }

    /*
    @Override
    public Iterator<String> iterator() {
        return listUrls.iterator();
    }*/

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }
}